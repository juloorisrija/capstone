package com.project.employee.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.project.employee.model.StatusReport;
import com.project.employee.model.StatusReportMapper;

@Repository
public class StatusReportDaoImpl implements StatusReportDao{

	JdbcTemplate jdbcTemplate;
	
	private final String SQL_GET_REPORT = "select * from statusreport";

	private final String SQL_CREATE_REPORT = "insert into statusreport"
									+ "	(comments,date2, userId,comlianceId, departId) "	
										+"values(?,?,?,?,?,? )";
	
	@Autowired
	public StatusReportDaoImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<StatusReport> getStatusreport() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(SQL_GET_REPORT, new StatusReportMapper());
	}

	@Override
	public boolean createStatus(StatusReport status) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update(SQL_CREATE_REPORT,status.getComments(),
				status.getDate2(),status.getUserId(),status.getComplianceId(),status.getDepartId())>0;
	}
	

}
