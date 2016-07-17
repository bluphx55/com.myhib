package com.myhib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainCerts {

	public static void main(String[] args) {
		
		CertsForStudents sC1 = new CertsForStudents();
		CertsForStudents sC2 = new CertsForStudents();
		sC1.setCertName("Core JAVA Cert Exam");
		sC2.setCertName("Oracle DB Cert Exam");
		
		StudentCerts s1 = new StudentCerts();
		StudentCerts s2 = new StudentCerts();
		s1.setStudent_name("Rome");
		(s1.getStudentCert()).add(sC1);
		(s1.getStudentCert()).add(sC2);
		
		s2.setStudent_name("Shante");
		(s2.getStudentCert()).add(sC2);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(s1);
		session.save(s2);
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
		

	}

}
