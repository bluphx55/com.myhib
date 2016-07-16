package com.myhib;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="HIBERNATE_TUTS_STUDENTS")
public class Student_Info {
	
	@Id  //sets the primary key of the table 
	@GeneratedValue //(strategy = GenerationType.IDENTITY) //auto generates the primary key value.
	@Column(name="STUDENT_ID")
	private int rollNo;
	
	//@Transient //skips over this column all together
	@Column(name="firstName", nullable=false) //attributes you can set on a column
	private String name;
	
//	@Temporal(TemporalType.TIMESTAMP) //sets a certain type of date field
//	private Date birthDate;
//	
	
//	public Date getBirthDate() {
//		return birthDate;
//	}
//	public void setBirthDate(Date birthDate) {
//		this.birthDate = birthDate;
//	}
	public int getrRllNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


}
