package com.learninghub.onlinequiz.models;

import com.learninghub.onlinequiz.ExtendClass.AdminTracker;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name="Category")
public class Category extends AdminTracker {
	
	@Id @GeneratedValue @Column(name="id") private int id;
	@Column(name="subject_category")
	private String subjectCategory;
	
	public Category() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSubjectCategory() {
		return subjectCategory;
	}

	public void setSubjectCategory(String subjectCategory) {
		this.subjectCategory = subjectCategory;
	}

	public Category(int id, String subjectCategory) {
		super();
		this.id = id;
		this.subjectCategory = subjectCategory;
	}
	

}
