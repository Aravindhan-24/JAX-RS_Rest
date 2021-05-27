package com.aravindhan.StaffRest;

import java.util.*;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class StaffRepository {
	Session session=null;
	
	public StaffRepository() {
		Configuration config= new Configuration().configure().addAnnotatedClass(Staff.class);
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
    	SessionFactory sf = config.buildSessionFactory(reg);
    	session = sf.openSession();
	}
	

	//get a particular staff with the given id
	public Staff getStaff(int id) {
		Staff obj = new Staff();
    	session.beginTransaction();
    	Query query = session.createQuery("from Staff where id=:i");
    	query.setParameter("i", id);
    	Staff staff = (Staff) query.uniqueResult();
    	if(staff!=null) {
    		obj.setId(staff.getId());
    		obj.setAge(staff.getAge());
    		obj.setDesignation(staff.getDesignation());
    		obj.setName(staff.getName());
    		obj.setSalary(staff.getSalary());
    		session.getTransaction().commit();
    		return obj;
    	}
    	
    	return null;
    	}
    
	
	//Add a staff 
	public void AddStaff(Staff s) {
		s.getId();
		s.getName();
		s.getAge();
		s.getSalary();
		s.getDesignation();

    	session.beginTransaction();
    	session.save(s);
    	session.getTransaction().commit();
    }
	
	//update staff with id, if staff dosen't exist create a new staff
	public void update(Staff s) {
		session.beginTransaction();
		Query query = session.createQuery("update Staff set age=:a, salary=:sal, designation=:des where id=:id and name=:n");
		query.setParameter("a", s.getAge());
		query.setParameter("sal", s.getSalary());
		query.setParameter("des", s.getDesignation());
		query.setParameter("id", s.getId());
		query.setParameter("n", s.getName());
		query.executeUpdate();
		session.getTransaction().commit();
		
	}
	//Delete staff with particular id
	public void deleteStaff(Staff s) {
		session.beginTransaction();
		Query query = session.createQuery("delete from Staff where id=:i");
		query.setParameter("i", s.getId());
		query.executeUpdate();
		session.getTransaction().commit();
	}

	//get all staffs
	public List<Staff> getStaff(){
		List<Staff> staffs = new ArrayList<>();
		Query query = session.createQuery("from Staff");
		List<Staff> staff = query.list();
		for(Staff s:staff) {
			staffs.add(s);
		}
		return staffs;
	}
	
}    
