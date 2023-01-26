package com.project.employee.dao;

import java.util.List;

import com.project.employee.model.StatusReport;

public interface StatusReportDao {
	
	List<StatusReport> getStatusreport();
	
	boolean createStatus(StatusReport status);

}
