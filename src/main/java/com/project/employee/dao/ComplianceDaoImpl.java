package com.project.employee.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.project.employee.model.Compliance;
import com.project.employee.model.ComplianceMapper;

@Repository
public class ComplianceDaoImpl implements ComplianceDao{

	JdbcTemplate jdbcTemplate;
	
	private final String SQL_GET_compliance = "select * from compliance";

	private final String SQL_ADD_COMPLIANCE = "insert into compliance"+"(complianceId,details,date1,departId,emplcount,status1,userId)"+"values(?,?,?,?,?,?,?)";
	
	//private final String SQL_UPDATE_COMPLIANCE ="update compliance set details=?,date1=?,departId=?,emplcount=?,status1=?,userId  where complianceId=?";
	
	@Autowired
	public ComplianceDaoImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Compliance> getComplaince() {
		//System.out.println("dao");
		// TODO Auto-generated method stub
		return jdbcTemplate.query(SQL_GET_compliance,new ComplianceMapper());
	}

	@Override
	public boolean createCompliance(Compliance compliance) {
		// TODO Auto-generated method stub
		try {
		return jdbcTemplate.update(SQL_ADD_COMPLIANCE,compliance.getComplianceId(),compliance.getDetails(),compliance.getDate1()
				,compliance.getDepartId(),compliance.getEmplcount(),compliance.getStatus1(),compliance.getUserId())>0;
		}catch(DataAccessException e) {
			return false;
		}
	}

//	@Override
//	public boolean updateCompliance(Compliance compliance) {
//		// TODO Auto-generated method stub
//		return jdbcTemplate.update(SQL_UPDATE_COMPLIANCE,compliance.getDetails(),compliance.getDate()
//				,compliance.getDepartid(),compliance.getEmplcount(),compliance.getStatus(),compliance.getUserid())>0;
//	}

}
