package com.project.employee.model;

public class Department {
	private int departId;
	private String departName;
	
	public Department() {
		super();
	}

	public Department(int departId, String departName) {
		super();
		this.departId = departId;
		this.departName = departName;
	}

	public int getDepartId() {
		return departId;
	}

	public void setDepartId(int departId) {
		this.departId = departId;
	}

	public String getDepartName() {
		return departName;
	}

	public void setDepartName(String departName) {
		this.departName = departName;
	}
	
	

}
