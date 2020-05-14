package com.learninghub.onlinequiz.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Feedback")
public class Feedback extends Tracker{
	
	@Id @GeneratedValue @Column(name="feedback_id") private int feedbackId;
	@Column(name="first_answer")
	private String firstAnswer;
	@Column(name="second_answer")
	private String secondAnswer;
	@Column(name="third_answer")
	private String thirdAnswer;

	@OneToOne()
	@JoinColumn(name="user_id")
	User user;
	
	public Feedback() {
		super();
	}
	

	public Feedback(int feedbackId, String firstAnswer, String secondAnswer, String thirdAnswer, User user) {
		super();
		this.feedbackId = feedbackId;
		this.firstAnswer = firstAnswer;
		this.secondAnswer = secondAnswer;
		this.thirdAnswer = thirdAnswer;
		this.user = user;
	}


	public int getFeedbackId() {
		return feedbackId;
	}

	public void setFeedbackId(int feedbackId) {
		this.feedbackId = feedbackId;
	}

	public String getFirstAnswer() {
		return firstAnswer;
	}

	public void setFirstAnswer(String firstAnswer) {
		this.firstAnswer = firstAnswer;
	}

	public String getSecondAnswer() {
		return secondAnswer;
	}

	public void setSecondAnswer(String secondAnswer) {
		this.secondAnswer = secondAnswer;
	}

	public String getThirdAnswer() {
		return thirdAnswer;
	}

	public void setThirdAnswer(String thirdAnswer) {
		this.thirdAnswer = thirdAnswer;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
