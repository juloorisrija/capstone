package com.project.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.employee.dao.EmployeeDao;
import com.project.employee.model.Employee;
import com.project.employee.model.User;


@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao employeeDao;
	
	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		List<Employee> employeeList = employeeDao.getEmployee();
		return employeeList;
	}

	@Override
	public boolean addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		System.out.println("add");
		return  employeeDao.createEmployee(employee);
	}

	@Override
	public boolean deleteEmployee(int UserId) {
		// TODO Auto-generated method stub
		return  employeeDao.deleteEmployee(UserId);
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		System.out.println("update");
		return employeeDao.updateEmployee(employee);
	}

	@Override
	public boolean validate(String userId, String password) {
		// TODO Auto-generated method stub
		List<User> userList = employeeDao.getUsers();
		boolean isValid =false;
		for(User user:userList) {
			if(user.getUserId().equalsIgnoreCase(userId) && user.getPassword().equalsIgnoreCase(password)) {
				isValid=true;
			}
		}
		return isValid;
	}

	@Override
	public int countEmployee() {
		// TODO Auto-generated method stub
		return employeeDao.countEmployee();
	}

	
}
