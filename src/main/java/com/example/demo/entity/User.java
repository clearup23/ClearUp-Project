package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Integer id;
	
	public User() {
		super();
	}

	public User(Integer id, String fullName, String role, String email, String password, String subject) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.role = role;
		this.email = email;
		this.password = password;
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", fullName=" + fullName + ", role=" + role + ", email=" + email + ", password="
				+ password + ", subject=" + subject + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	private String fullName;
	
	private String role;
	
	private String email;
	
	private String password;
	
	private String subject;
	
	
}
