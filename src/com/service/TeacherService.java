package com.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bean.Org;
import com.bean.Teachers;
import com.dao.TeachersDao;


@Service
@Transactional
public class TeacherService {
	@Autowired
	private TeachersDao teachersDao;
	
	public void saveTeachers(Teachers teachers){
		this.teachersDao.saveTeachers(teachers);
	}
	
	public void saveOrg(Org org){
		this.teachersDao.saveOrg(org);
	}
	
	public void update(Teachers teachers){
		this.teachersDao.update(teachers);
	}
	public void delete(Teachers teachers){
		this.teachersDao.delete(teachers);
	}
	public List<Teachers> listTeachers(Map map){
		return this.teachersDao.listTeachers(map);
	}
	public List<Org> listOrg(){
		return this.teachersDao.listOrg();
	}
	public Org getOrgById(int id){
		return this.teachersDao.getOrgById(id);
	}
	public Teachers getTeachersById(int id){
		return this.teachersDao.getTeachersById(id);
	}
}
