package com.project.employee.model;

import java.util.Date;

public class Employee {
	private int userId;
	private String firstName;
	private String lastName;
	private String dob;
	private String email;
	private int departId;
	public Employee() {
		
	}
	public Employee(int userId, String firstName, String lastName, String dob, String email, int departId) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.email = email;
		this.departId = departId;
	}
	public int getUserId() {
		return userId;
	}
	public  void setUserId(int userId) {
		this.userId = userId;
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
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getDepartId() {
		return departId;
	}
	public void setDepartId(int departId) {
		this.departId = departId;
	}
	
	
}
