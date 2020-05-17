package com.learninghub.onlinequiz.models;

import com.learninghub.onlinequiz.ExtendClass.Tracker;
import org.aspectj.bridge.IMessage;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Date;

@Entity
@Table(name="User")
public class User extends Tracker {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id") private int userId;

	@NotBlank(message = "first name can not blank")
	@NotNull(message = "first name can not be null")
	@Column(name="user_first_name")
	private String userFirstName;


	@Column(name="user_last_name")

	private String userLastName;

	@Email(message="email invalid ")
	@NotBlank(message = "email not blank")
	@Column(name="user_email")
	private String userEmail;

	@NotBlank(message = "password can not blank")
	@NotNull(message = "password cannot be null")
	@Column(name="user_password")
	private String userPassword;


	@Pattern(regexp = "[0-9]+" ,message = "invalid mobile number")
	@NotBlank(message = "number cannot be blank  ")
	@NotNull
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

	public User(Date createdAt, Date updatedAt, int userId, @NotBlank(message = "first name can not blank") @NotNull(message = "first name can not be null") String userFirstName, String userLastName, @Email(message = "email invalid ") @NotBlank(message = "email not blank") String userEmail, @NotBlank(message = "password can not blank") @NotNull(message = "password cannot be null") String userPassword, @Pattern(regexp = "[0-9]+", message = "invalid mobile number") @NotBlank(message = "number cannot be blank  ") @NotNull String userContact, String userState, String userDob, String userDegree, Boolean userActive) {
		super(createdAt, updatedAt);
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

	public User(){

	}

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
}
