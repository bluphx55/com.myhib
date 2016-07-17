package com.myhib;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="hib_tuts_stuCerts")
public class StudentCerts {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String student_name;
	
	
	@ManyToMany(cascade = CascadeType.ALL)
	private Set<CertsForStudents> studentCert = new HashSet<CertsForStudents>(0);
	
	
	
	public Set<CertsForStudents> getStudentCert() {
		return studentCert;
	}

	public void setStudentCert(Set<CertsForStudents> studentCert) {
		this.studentCert = studentCert;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	
	
	
	
	

}
