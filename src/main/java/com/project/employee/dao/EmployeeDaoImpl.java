package com.project.employee.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.project.employee.model.Department;
import com.project.employee.model.Employee;
import com.project.employee.model.EmployeeMapper;
import com.project.employee.model.User;
import com.project.employee.model.UserMapper;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{

	JdbcTemplate jdbcTemplate;
	
	private final String SQL_GET_EMPLOYEE = "select * from employeepro";

	private final String SQL_CREATE_EMPLOYEE = "insert into employeepro"
									+ "	(firstName,lastName, dob, email, departId) "	
										+"values(?,?,?,?,? )";
	
	private final String SQL_DELETE_EMPLOYEE = "delete from employeepro where userId = ?";
	
	private final String SQL_UPDATE_EMPLOYEE = "update employeepro set firstName = ?,lastName=?, dob = ?,email=?,departId=? where userId= ?";
	
	private final String SQL_Get_Userdetails = "select * from admin";
	
	private final String SQL_COUNT_EMPLOYEE ="select count(userId) from employeepro";
	
	@Autowired
	public EmployeeDaoImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Employee> getEmployee() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(SQL_GET_EMPLOYEE, new EmployeeMapper());
	}

	@Override
	public boolean  createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update(SQL_CREATE_EMPLOYEE, employee.getFirstName(),employee.getLastName()
				, employee.getDob(),employee.getEmail(), employee.getDepartId()) > 0;
	}

	@Override
	public boolean deleteEmployee(int userId) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update(SQL_DELETE_EMPLOYEE, userId) > 0;
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update(SQL_UPDATE_EMPLOYEE,  employee.getFirstName(),employee.getLastName()
				, employee.getDob(),employee.getEmail(), employee.getDepartId(),employee.getUserId()) > 0;
	}

	
	@Override
	public List<User> getUsers(){
		// TODO Auto-generated method stub
		return jdbcTemplate.query(SQL_Get_Userdetails,new UserMapper());
	}

	@Override
	public int countEmployee() {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForObject(SQL_COUNT_EMPLOYEE, Integer.class);
	}

	

}
