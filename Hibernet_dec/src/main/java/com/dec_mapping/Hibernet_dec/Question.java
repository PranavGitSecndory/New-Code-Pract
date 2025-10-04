package com.dec_mapping.Hibernet_dec;



import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Question {

	@Id
	private int QueId;
	private String Ques;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ansId")
	private Answer answer;
	
	public Question(int queId, String ques) {
		super();
		QueId = queId;
		Ques = ques;
	}
	
	public Question(int queId, String ques, Answer answer) {
		super();
		QueId = queId;
		Ques = ques;
		this.answer = answer;
	}

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getQueId() {
		return QueId;
	}
	public void setQueId(int queId) {
		QueId = queId;
	}
	public String getQues() {
		return Ques;
	}
	public void setQues(String ques) {
		Ques = ques;
	}
	
	

}