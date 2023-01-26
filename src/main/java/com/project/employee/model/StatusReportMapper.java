package com.project.employee.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StatusReportMapper implements RowMapper<StatusReport>{

	@Override
	public StatusReport mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		StatusReport status = new StatusReport();
		
		status.setStatusId(rs.getInt("statusId"));
		status.setComments(rs.getString("comments"));
		status.setDate2(rs.getString("date2"));
		status.setUserId(rs.getInt("userId"));
		status.setComplianceId(rs.getInt("complianceId"));
		status.setDepartId(rs.getInt("departId"));
        return status;

	}

}
