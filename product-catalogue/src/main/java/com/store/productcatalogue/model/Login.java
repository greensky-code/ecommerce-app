package com.store.productcatalogue.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Login")
public class Login {

	@Id
	@Column(name = "username")
	String username;

	@Column(name = "password")
	String password;

	@Column(name = "type")
	boolean type;

	public Login() {
	}

	public Login(String username, String password, boolean type) {
		this.username = username;
		this.password = password;
		this.type = type;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isType() {
		return type;
	}

	public void setType(boolean type) {
		this.type = type;
	}

}
