package com.myhib;



import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
		
		StudentAddress s1 = new StudentAddress();
		StudentAddress s2 = new StudentAddress();
		AddressForStudent a1 = new AddressForStudent();
		AddressForStudent a2 = new AddressForStudent();
		
		s1.setName("Rome");
		s2.setName("Shante");
		
		a1.setAddress("3514 N Woodbine Ter");
		a2.setAddress("2712 Meadow Dawn Ln");
		
		s1.setAddress(a1);
		s2.setAddress(a1);
		
		(a1.getStudents()).add(s1);
		(a1.getStudents()).add(s2);
		
//		//Setup for one to one relationship between databases
//		Student_Info s1 = new Student_Info();
//		Student_Info s2 = new Student_Info();
//		
//		StudentDetail sd1 = new StudentDetail();
//		StudentDetail sd2 = new StudentDetail();
//		
		
	
//		s1.setName("Rome");
//		s2.setName("Rome5");
//		
//		sd1.setPhoneNum("1234567890");
//		sd2.setPhoneNum("0987456321");
//		
//		sd1.setStudentInfo(s1);
//		sd2.setStudentInfo(s2);
//		
		
//		student.setName("Rome5");
//		//student.setRollNo(5);
//		student.setBirthDate(new Date());
//		
//		student2.setName("Rome2");
//		//student.setRollNo(5);
//		student2.setBirthDate(new Date());
		
		
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		
		//session.save(s2);
		session.save(a2);
		session.save(a1);
		
//		session.save(sd1);
//		session.save(s2);
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
		
	}

}
