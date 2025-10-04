package com.dec_mapping.Hibernet_dec;



import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Answer {
	
	@Id
	 private int ansId;
	 private String ans;
	 
	 
	public int getAnsId() {
		return ansId;
	}
	 
	public Answer(int ansId, String ans) {
		super();
		this.ansId = ansId;
		this.ans = ans;
	}

	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setAnsId(int ansId) {
		this.ansId = ansId;
	}
	
	public String getAns() {
		return ans;
	}
	
	public void setAns(String ans) {
		this.ans = ans;
	}
	 	
}