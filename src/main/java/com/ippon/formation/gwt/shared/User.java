package com.ippon.formation.gwt.shared;

import java.io.Serializable;

@SuppressWarnings("serial")
public class User implements Serializable {

	String id;
	
	String firstName;
	
	String lastName;
	
	String emailAddress;
	
	String password;

	public User() {
		
	}
	
	public User(String id, String firstName, String lastName, String emailAddress, String password) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.password = password;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
