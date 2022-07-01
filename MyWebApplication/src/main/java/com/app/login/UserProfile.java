package com.app.login;

import java.io.Serializable;

public class UserProfile implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String username;
	private String useremail;
	private String password;
	
	// Getter and Setter for user's name.
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	// Getter and Setter for user's email
	public String getUseremail() {
		return useremail;
	}

	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	
	// Getter and Setter for user's password
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
