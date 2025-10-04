package com.onetoone;



import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Question1
{
	@Id
	private int que_id;
	
	private String question;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Answer1 answer;

	public Question1(int que_id, String question, Answer1 answer) {
		super();
		this.que_id = que_id;
		this.question = question;
		this.answer = answer;
	}

	public Question1() {
		super();
	}

	public int getQue_id() {
		return que_id;
	}

	public void setQue_id(int que_id) {
		this.que_id = que_id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Answer1 getAnswer() {
		return answer;
	}

	public void setAnswer(Answer1 answer) {
		this.answer = answer;
	}
	
	
}