package com.project.employee.dao;

import java.util.List;

import com.project.employee.model.Department;
import com.project.employee.model.Employee;
import com.project.employee.model.User;

public interface EmployeeDao {
	
	public List<User> getUsers();
	
	List<Employee> getEmployee();
	
	boolean createEmployee(Employee employee);
	boolean deleteEmployee(int userId);
	boolean updateEmployee(Employee employee);
	int countEmployee();
	

}