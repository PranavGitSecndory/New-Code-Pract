package com.Add_Ex;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	private String city;
	private String conutry;
	
	public Address(String city, String conutry) {
		super();
		this.city = city;
		this.conutry = conutry;
	}
	
	public Address() {
		super();
	}

	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getConutry() {
		return conutry;
	}
	
	public void setConutry(String conutry) {
		this.conutry = conutry;
	}
	

}