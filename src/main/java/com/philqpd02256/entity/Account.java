package com.philqpd02256.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {

	private String username;
	private String password;
	private String fullName;

	public Account() {
	}

	public Account(String username, String password, String fullName) {
		super();
		this.username = username;
		this.password = password;
		this.fullName = fullName;
	}

	@Id
	@Column(length = 16)
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(length = 16, nullable = false)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(columnDefinition="nvarchar(30)", nullable = false)
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

}
