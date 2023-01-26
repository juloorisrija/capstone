package com.project.employee.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.project.employee.model.Department;
import com.project.employee.model.DepartmentMapper;
@Repository
public class DepartmentDaoImpl implements DepartmentDao{
	
	JdbcTemplate jdbcTemplate;
	private final String SQL_GET_DEPARTMENT="select * from department";
	private final String SQL_ADD_DEPARTMENT="insert into department"+"(departId,departName)"+"values(?,?)";
	private final String SQL_DELETE_DEPARTMENT="delete from department where departId=?";
    private final String SQL_Count_DEPARTMENT = "select count(departId) from department";
    
    private final String SQL_DELETE_employee="delete from employeepro where departId=?";
	@Autowired
	public DepartmentDaoImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Department> getDepartment() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(SQL_GET_DEPARTMENT,new DepartmentMapper());
	}

	@Override
	public boolean createDepartment(Department department) {
		// TODO Auto-generated method stub
		System.out.println("create");
		return jdbcTemplate.update(SQL_ADD_DEPARTMENT,department.getDepartId(),department.getDepartName())>0;
	}
	@Override
	public boolean deleteEmployee(int departId) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update(SQL_DELETE_employee, departId)>0;
	}

		
	

	@Override
	public boolean deleteDepartment(int departId) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update(SQL_DELETE_DEPARTMENT, departId)>0;
	}

	@Override
	public int countDepartment() {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForObject(SQL_Count_DEPARTMENT, Integer.class);
	}
	

}
