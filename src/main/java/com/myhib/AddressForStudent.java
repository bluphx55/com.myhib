package com.myhib;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="Hib_tuts_Adress")
public class AddressForStudent {
	
	@Id @GeneratedValue //auto generates the Primary Key
	private int address_id;
	
	private String address;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "address")
	private Set<StudentAddress> students = new HashSet<StudentAddress>(0);;
	
	public Set<StudentAddress> getStudents() {
		return students;
	}
	
	public void setStudents(Set<StudentAddress> students){
		this.students = students;
	}
	
	public int getAddress_id() {
		return address_id;
	}

	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
