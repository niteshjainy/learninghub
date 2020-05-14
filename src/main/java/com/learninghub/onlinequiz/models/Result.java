package com.learninghub.onlinequiz.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity

@Table(name="Result")
public class Result extends Tracker{

	@Id @GeneratedValue @Column(name="result_id")	private int resultId;
	@Column(name="attempted")
	private int attempted;
	@Column(name="not_attempted")
	private int notAttempted;
	@Column(name="total_marks")
	private int totalMarks;
	@Column(name="correct")
	private int correct;
	@Column(name="not_correct")
	private int notCorrect;
	
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	@ManyToOne
	@JoinColumn(name="category_id")
	private Category category;
	
	
	public Result() {
		super();
	}


	public Result(int resultId, int attempted, int notAttempted, int totalMarks, int correct, int notCorrect, User user,
			Category category) {
		super();
		this.resultId = resultId;
		this.attempted = attempted;
		this.notAttempted = notAttempted;
		this.totalMarks = totalMarks;
		this.correct = correct;
		this.notCorrect = notCorrect;
		this.user = user;
		this.category = category;
	}


	public int getResultId() {
		return resultId;
	}


	public void setResultId(int resultId) {
		this.resultId = resultId;
	}


	public int getAttempted() {
		return attempted;
	}


	public void setAttempted(int attempted) {
		this.attempted = attempted;
	}


	public int getNotAttempted() {
		return notAttempted;
	}


	public void setNotAttempted(int notAttempted) {
		this.notAttempted = notAttempted;
	}


	public int getTotalMarks() {
		return totalMarks;
	}


	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}


	public int getCorrect() {
		return correct;
	}


	public void setCorrect(int correct) {
		this.correct = correct;
	}


	public int getNotCorrect() {
		return notCorrect;
	}


	public void setNotCorrect(int notCorrect) {
		this.notCorrect = notCorrect;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}

	
	
}
