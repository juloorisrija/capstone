package com.project.employee.service;

import java.util.List;

import com.project.employee.model.Employee;

public interface EmployeeService {
	
	public boolean validate(String userId,String password);
	
	public List<Employee> getAllEmployee();
	
	public boolean addEmployee(Employee employee);
	
	public boolean deleteEmployee(int UserId);
	
	public boolean updateEmployee(Employee employee);

	public int countEmployee();
}
