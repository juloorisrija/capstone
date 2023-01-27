package com.project.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.employee.dao.ComplianceDao;
import com.project.employee.model.Compliance;

@Service
public class ComplianceServiceImpl implements ComplianceService {

	@Autowired
	ComplianceDao complianceDao;
	
	
	@Override
	public List<Compliance> getAllCompliance() {
		//System.out.println("service");
		// TODO Auto-generated method stub
		List<Compliance> complianceList = complianceDao.getComplaince();
		return complianceList;
	}


	@Override
	public boolean addCompliance(Compliance compliance) {
		// TODO Auto-generated method stub
		return complianceDao.createCompliance(compliance);
	}


//	@Override
//	public boolean updateCompliance(Compliance compliance) {
//		// TODO Auto-generated method stub
//		return complianceDao.updateCompliance(compliance);
//	}
	

}
