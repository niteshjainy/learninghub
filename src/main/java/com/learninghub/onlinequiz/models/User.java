package com.learninghub.onlinequiz.models;

import com.learninghub.onlinequiz.ExtendClass.Tracker;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User extends Tracker {

	@Id @GeneratedValue	@Column(name="user_id") private int userId;
	@Column(name="user_first_name")
	private String userFirstName;
	@Column(name="user_last_name")
	private String userLastName;
	@Column(name="user_email")
	private String userEmail;
	@Column(name="user_password")
	private String userPassword;
	@Column(name="user_contact")
	private String userContact;
	@Column(name="user_state")
	private String userState;
	@Column(name="user_dob")
	private String userDob;
	@Column(name="user_degree")
	private String userDegree;
	@Column(name="user_active")
	private Boolean userActive;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserFirstName() {
		return userFirstName;
	}
	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}
	public String getUserLastName() {
		return userLastName;
	}
	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserContact() {
		return userContact;
	}
	public void setUserContact(String userContact) {
		this.userContact = userContact;
	}
	public String getUserState() {
		return userState;
	}
	public void setUserState(String userState) {
		this.userState = userState;
	}
	public String getUserDob() {
		return userDob;
	}
	public void setUserDob(String userDob) {
		this.userDob = userDob;
	}
	public String getUserDegree() {
		return userDegree;
	}
	public void setUserDegree(String userDegree) {
		this.userDegree = userDegree;
	}
	public Boolean getUserActive() {
		return userActive;
	}
	public void setUserActive(Boolean userActive) {
		this.userActive = userActive;
	}
	public User(int userId, String userFirstName, String userLastName, String userEmail, String userPassword,
			String userContact, String userState, String userDob, String userDegree, Boolean userActive) {
		super();
		this.userId = userId;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.userContact = userContact;
		this.userState = userState;
		this.userDob = userDob;
		this.userDegree = userDegree;
		this.userActive = userActive;
	}
	public User() {
		super();
	}
	
			
}
