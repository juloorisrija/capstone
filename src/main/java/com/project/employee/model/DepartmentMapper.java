package com.project.employee.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class DepartmentMapper implements RowMapper<Department>{

	@Override
	public Department mapRow(ResultSet rs,int rowNum)throws SQLException{
		
		Department department = new Department();
		department.setDepartId(rs.getInt("departId"));
		department.setDepartName(rs.getString("departName"));
        return department;
	}
}
