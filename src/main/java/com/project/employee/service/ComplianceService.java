package com.project.employee.service;

import java.util.List;

import com.project.employee.model.Compliance;


public interface ComplianceService {

	public List<Compliance> getAllCompliance();
	
	public boolean addCompliance(Compliance compliance);
	
	public boolean updateCompliance(Compliance compliance);
}
