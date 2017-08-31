package com.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bean.Org;
import com.bean.Teachers;
import com.service.TeacherService;

@Controller
@RequestMapping("/ttt")
public class TeachersController {
	@Autowired
	private TeacherService teacherService;
	
	@RequestMapping("/list")
	public String list(Model model){
		System.out.println("hello world");
		Map map=new HashMap();
		List<Teachers> list=teacherService.listTeachers(map);
		model.addAttribute("list", list);
		return "list";
	} 


	
	//跳转到添加老师信息页面
	@RequestMapping("/addTeachers")
	public String addTeachers(Model model){
		List<Org> list=teacherService.listOrg();
		model.addAttribute("list", list);
		return "addTeachers";
	}
	
	//保存
	@RequestMapping("/saveTeachers")
	public String saveTeachers(Teachers teachers,int oid){
		if(oid!=-1){
			Org org=this.teacherService.getOrgById(oid);
			teachers.setOrg(org);
		} 
		teachers.setUpdate_date(new Date());
		this.teacherService.saveTeachers(teachers);
		return "redirect:/ttt/list";
	}
	
	@RequestMapping("/addOrg")
	public String addOrg(Org org){
		return "addOrg";
	}
	
	@RequestMapping("/saveOrg")
	public String saveOrg(Org org){
		this.teacherService.saveOrg(org);
		return "redirect:/ttt/list";
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable("id")int id){
		Teachers teachers=this.teacherService.getTeachersById(id);
		teacherService.delete(teachers);
		return "redirect:/ttt/list";
	}
	
	@RequestMapping("/bfupdate/{id}")
	public String bfupdate(@PathVariable("id")int id,Model model){
		Teachers teachers=teacherService.getTeachersById(id);
		List<Org> list=teacherService.listOrg();
		model.addAttribute("list", list);
		model.addAttribute("teachers", teachers);
		return "update";
	}
	
	@RequestMapping("/update")
	public String update(Teachers teachers,int id){
		Org org=teacherService.getOrgById(id);
		teachers.setOrg(org);
		teacherService.update(teachers);
		return "redirect:/ttt/list";
	}
}
