package com.project.employee.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ComplianceMapper implements RowMapper<Compliance>{
	
	@Override
	public Compliance mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Compliance compliance  = new Compliance();
		
		compliance.setComplianceId(rs.getInt("complianceId"));
		compliance.setDetails(rs.getString("details"));
		compliance.setDate1(rs.getString("date1"));
		compliance.setDepartId(rs.getString("departId"));
		compliance.setEmplcount(rs.getInt("emplcount"));
		compliance.setStatus1(rs.getString("status1"));
		compliance.setUserId(rs.getInt("userId"));
		return compliance;
	}

	
}
