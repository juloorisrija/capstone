package com.project.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.employee.dao.StatusReportDao;
import com.project.employee.model.StatusReport;
@Service
public class StatusReportServiceImpl implements  StatusReportService{

	
	@Autowired
	StatusReportDao statusreport; 
	
	@Override
	public List<StatusReport> getAllStatus() {
		// TODO Auto-generated method stub
		return statusreport.getStatusreport();
	}

	@Override
	public boolean addStatus(StatusReport status) {
		// TODO Auto-generated method stub
		return statusreport.createStatus(status);
	}

}
