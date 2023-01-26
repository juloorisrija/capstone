package com.project.employee.model;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;



public class EmployeeMapper implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Employee employee = new Employee();
		
		employee.setUserId(rs.getInt("userId"));
		employee.setFirstName(rs.getString("firstName"));
		employee.setLastName(rs.getString("lastName"));
		employee.setDob(rs.getString("dob"));
		employee.setEmail(rs.getString("email"));
		employee.setDepartId(rs.getInt("departId"));
		return employee;
	}


}
