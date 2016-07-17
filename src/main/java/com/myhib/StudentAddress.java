package com.myhib;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Hib_Tuts_Student")
public class StudentAddress {
	
	@Id  //sets the primary key of the table 
	@GeneratedValue
	private int id;
	
	
	@Column(name="firstName", nullable=false) //attributes you can set on a column
	private String name;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private AddressForStudent address;

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public AddressForStudent getAddress() {
		return address;
	}
	public void setAddress(AddressForStudent address) {
		this.address = address;
	}

	
}
