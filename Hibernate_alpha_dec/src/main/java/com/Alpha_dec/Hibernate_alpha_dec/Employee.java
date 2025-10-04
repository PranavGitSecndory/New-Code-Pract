package com.Alpha_dec.Hibernate_alpha_dec;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;




@Entity
public class Employee {
	@Id
	@Column(name ="Emp_id")
	private int id;
	@Column(name ="Emp_name")
	private String name;
	
	
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
}
