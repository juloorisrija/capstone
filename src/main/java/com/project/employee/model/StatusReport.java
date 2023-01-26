package com.project.employee.model;

public class StatusReport {
	
	private int statusId;
	private String comments;
	private String date2;
	private int userId;
	private int complianceId;
	private int departId;
	public StatusReport() {
		super();
	}
	
	
	public StatusReport(int statusId, String comments, String date2, int userId, int complianceId, int departId) {
		super();
		this.statusId = statusId;
		this.comments = comments;
		this.date2 = date2;
		this.userId = userId;
		this.complianceId = complianceId;
		this.departId = departId;
	}


	public int getStatusId() {
		return statusId;
	}
	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getDate2() {
		return date2;
	}
	public void setDate2(String date2) {
		this.date2 = date2;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getComplianceId() {
		return complianceId;
	}
	public void setComplianceId(int complianceId) {
		this.complianceId = complianceId;
	}
	public int getDepartId() {
		return departId;
	}
	public void setDepartId(int departId) {
		this.departId = departId;
	}
	
	

}
