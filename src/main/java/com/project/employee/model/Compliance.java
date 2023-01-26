package com.project.employee.model;

public class Compliance {
	
   private int complianceId=0;
   private String details;
   private String date;
   private String departid;
   private int emplcount;
   private String status;
   private int userid;
   
   
public Compliance() {
	super();
}


public Compliance(int complianceId, String details, String date, String departid, int emplcount, String status,
		int userid) {
	super();
	this.complianceId = complianceId;
	this.details = details;
	this.date = date;
	this.departid = departid;
	this.emplcount = emplcount;
	this.status = status;
	this.userid = userid;
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


public String getDate() {
	return date;
}


public void setDate(String date) {
	this.date = date;
}


public String getDepartid() {
	return departid;
}


public void setDepartid(String departid) {
	this.departid = departid;
}


public int getEmplcount() {
	return emplcount;
}


public void setEmplcount(int emplcount) {
	this.emplcount = emplcount;
}


public String getStatus() {
	return status;
}


public void setStatus(String status) {
	this.status = status;
}


public int getUserid() {
	return userid;
}


public void setUserid(int userid) {
	this.userid = userid;
}

}
