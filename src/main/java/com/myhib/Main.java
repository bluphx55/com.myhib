package com.myhib;



import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
		Student_Info s1 = new Student_Info();
		Student_Info s2 = new Student_Info();
		
		StudentDetail sd1 = new StudentDetail();
		StudentDetail sd2 = new StudentDetail();
		
		s1.setName("Rome");
		s2.setName("Rome5");
		
		sd1.setPhoneNum("1234567890");
		sd2.setPhoneNum("0987456321");
		
		sd1.setStudentInfo(s1);
		sd2.setStudentInfo(s2);
		
		
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
		
		session.save(sd1);
		session.save(s2);
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
		
	}

}
