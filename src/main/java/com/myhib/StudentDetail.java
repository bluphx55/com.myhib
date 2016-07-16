package com.myhib;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;


@Entity
@Table(name="HIBERNATE_TUTS_STUDENT_DETAIL")
public class StudentDetail {
	
	
	@Id @GeneratedValue(generator = "newGenerator")
	//@Column(name="STUDENT_ID")
	@GenericGenerator(name="newGenerator", strategy = "foreign", parameters = { @Parameter(value = "studentInfo", name = "property")})
	private int student_id;
	
	private String phoneNum;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "rollNo")
	private Student_Info studentInfo;

	
	public int getStudent_Id() {
		return student_id;
	}

	public void setStudent_Id(int student_id) {
		this.student_id = student_id;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public Student_Info getStudentInfo() {
		return studentInfo;
	}

	public void setStudentInfo(Student_Info studentInfo) {
		this.studentInfo = studentInfo;
	}
	
	

	
}
