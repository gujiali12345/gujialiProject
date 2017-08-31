package com.dao;



import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bean.Org;
import com.bean.Teachers;

@Component
public class TeachersDao {
	@Autowired
	private SessionFactory sf;
	
	public Session getSession(){
		return this.sf.getCurrentSession();
	}
	
	public void saveTeachers(Teachers teachers){
		Session session=getSession();
		session.save(teachers);
	}
	
	public void saveOrg(Org org){
		Session session=getSession();
		session.save(org);
	}
	
	public void update(Teachers teachers){
		Session session=getSession();
		session.update(teachers);
	}
	public void delete(Teachers teachers){
		Session session=getSession();
		session.delete(teachers);
	}
	
	public List<Teachers> listTeachers(Map map){
		String hql="from Teachers";
		Session session=getSession();
		List<Teachers> list=session.createQuery(hql).list();
		return list;
	}
	public List<Org> listOrg(){
		String hql="from Org";
		Session session=getSession();
		List<Org> list=session.createQuery(hql).list();
		return list;
	}
	
	public Org getOrgById(int id){
		Session session=getSession();
		Org org=(Org)session.get(Org.class,id);
		return org;
	}
	
	public Teachers getTeachersById(int id){
		Session session=getSession();
		Teachers teachers=(Teachers)session.get(Teachers.class, id);
		return teachers;
	}
}
