package com.project.employee.dao;

import java.util.List;

import com.project.employee.model.Compliance;


public interface ComplianceDao {

	  List<Compliance> getComplaince();
	  
	  boolean createCompliance(Compliance compliance);
	  
	 // boolean updateCompliance(Compliance compliance);
}
