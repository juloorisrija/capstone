package com.project.employee.service;

import java.util.List;


import com.project.employee.model.StatusReport;

public interface StatusReportService {
	
public List<StatusReport> getAllStatus();
	
	public boolean addStatus(StatusReport status);

}
