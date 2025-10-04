package com.onetoone;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Answer1 
{
	@Id
	private int ans_id;
	
	private String answer;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Question1 question;

	public Answer1(int ans_id, String answer, Question1 question) {
		super();
		this.ans_id = ans_id;
		this.answer = answer;
		this.question = question;
	}

	public Answer1() {
		super();
	}

	public int getAns_id() {
		return ans_id;
	}

	public void setAns_id(int ans_id) {
		this.ans_id = ans_id;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Question1 getQuestion() {
		return question;
	}

	public void setQuestion(Question1 question) {
		this.question = question;
	}
	
	
	
}