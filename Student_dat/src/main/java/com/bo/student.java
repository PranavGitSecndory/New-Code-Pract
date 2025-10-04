package com.bo;

public class student {
	
	private int RollNo;
	private String name ;
	private String password;
	private String contactno;
	private String email;
	private String birhtdate;
	private String city;
	
	
	
	
	public student(int rollNo, String name, String password, String contactno, String email, String birhtdate,
			String city) {
		super();
		RollNo = rollNo;
		this.name = name;
		this.password = password;
		this.contactno = contactno;
		this.email = email;
		this.birhtdate = birhtdate;
		this.city = city;
	}

	public student() {
		super();
		
	}

	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setBirhtdate(String birhtdate) {
		this.birhtdate = birhtdate;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public student (String name,String password,String contactno,String email,String birhtdate,String city)
	{
		
		this.name = name;
		this.birhtdate = birhtdate;
		this.password = password;
		this.city = city;
		this.email = email;
		this.contactno = contactno;
	}
	
	public int getRollNo()
	{
		return RollNo;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public String getContactno() {
		return contactno;
	}

	public String getEmail() {
		return email;
	}

	public String getBirhtdate() {
		return birhtdate;
	}

	public String getCity() {
		return city;
	}
	
	

}