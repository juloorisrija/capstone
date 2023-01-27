package com.project.employee.model;

public class Compliance {
	
   private int complianceId=0;
   private String details;
   private String date1;
   private String departId;
   private int emplcount;
   private String status1;
   private int userId;
   
   
public Compliance() {
	super();
}


public Compliance(int complianceId, String details, String date1, String departId, int emplcount, String status1,
		int userId) {
	super();
	this.complianceId = complianceId;
	this.details = details;
	this.date1 = date1;
	this.departId = departId;
	this.emplcount = emplcount;
	this.status1 = status1;
	this.userId = userId;
}


public int getComplianceId() {
	return complianceId;
}


public void setComplianceId(int complianceId) {
	this.complianceId = complianceId;
}


public String getDetails() {
	return details;
}


public void setDetails(String details) {
	this.details = details;
}


public String getDate1() {
	return date1;
}


public void setDate1(String date1) {
	this.date1 = date1;
}


public String getDepartId() {
	return departId;
}


public void setDepartId(String departId) {
	this.departId = departId;
}


public int getEmplcount() {
	return emplcount;
}


public void setEmplcount(int emplcount) {
	this.emplcount = emplcount;
}


public String getStatus1() {
	return status1;
}


public void setStatus1(String status1) {
	this.status1 = status1;
}


public int getUserId() {
	return userId;
}


public void setUserId(int userId) {
	this.userId = userId;
}

}
