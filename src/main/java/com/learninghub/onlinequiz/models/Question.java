package com.learninghub.onlinequiz.models;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Question")
public class Question extends Tracker{
		@Id @GeneratedValue(strategy=GenerationType.AUTO) @Column(name="question_id") private int questionId;
		@Column(name="question")
	private String question;
		@Column(name="first_option")
	private String firstOption;
		@Column(name="second_option")
	private String secondOption;
		@Column(name="third_option")
	private String thirdOption;
		@Column(name="fourth_option")
	private String fourthOption;
		@Column(name="answer")
	private String answer;
	
	@ManyToOne
	@JoinColumn(name="category_id")
	Category category;
	
	
	public Question(int questionId, String question, String firstOption, String secondOption, String thirdOption,
			String fourthOption, String answer, Category category) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.firstOption = firstOption;
		this.secondOption = secondOption;
		this.thirdOption = thirdOption;
		this.fourthOption = fourthOption;
		this.answer = answer;
		this.category = category;
	}


	public int getQuestionId() {
		return questionId;
	}


	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}


	public String getQuestion() {
		return question;
	}


	public void setQuestion(String question) {
		this.question = question;
	}


	public String getFirstOption() {
		return firstOption;
	}


	public void setFirstOption(String firstOption) {
		this.firstOption = firstOption;
	}


	public String getSecondOption() {
		return secondOption;
	}


	public void setSecondOption(String secondOption) {
		this.secondOption = secondOption;
	}


	public String getThirdOption() {
		return thirdOption;
	}


	public void setThirdOption(String thirdOption) {
		this.thirdOption = thirdOption;
	}


	public String getFourthOption() {
		return fourthOption;
	}


	public void setFourthOption(String fourthOption) {
		this.fourthOption = fourthOption;
	}


	public String getAnswer() {
		return answer;
	}


	public void setAnswer(String answer) {
		this.answer = answer;
	}


	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}


	public Question() {
		super();
	}

}
