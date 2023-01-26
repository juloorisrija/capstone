package com.project.employee.service;

import java.util.List;

import com.project.employee.model.Department;



public interface DepartmentService {
	
	public boolean validate(int departId);
	
    public List<Department> getAllDepartments();
	
	public boolean deleteEmployee(int id);

	public boolean addDepartment(Department department);
	
	public boolean deleteDepartment(int DepartId);
	
	public int countDepartment();


}
