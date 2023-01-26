package com.project.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.employee.dao.DepartmentDao;
import com.project.employee.model.Department;
@Service
public class DepartmentServiceImpl implements DepartmentService{

	@Autowired
	DepartmentDao departmentDao;
	@Override
	public List<Department> getAllDepartments() {
		// TODO Auto-generated method stub
		List<Department> departmentList = departmentDao.getDepartment();
		return departmentList;
	}

	@Override
	public boolean addDepartment(Department department) {
		// TODO Auto-generated method stub
		System.out.println("add1");
		return departmentDao.createDepartment(department);
	}

	@Override
	public boolean deleteDepartment(int DepartId) {
		// TODO Auto-generated method stub
		return departmentDao.deleteDepartment(DepartId);
	}

	@Override
	public int countDepartment() {
		// TODO Auto-generated method stub
		return departmentDao.countDepartment();
	}

	@Override
	public boolean validate(int departId) {
		// TODO Auto-generated method stub
		List<Department> departmentList = departmentDao.getDepartment();
		boolean isValid = false;
		for(Department dept : departmentList) {
			System.out.println(dept.getDepartId());
			System.out.println(departId);
			if(dept.getDepartId()==(departId)) {
				isValid=true;
			}
			
		}
		return isValid;
	}

	@Override
	public boolean deleteEmployee(int id) {
		// TODO Auto-generated method stub
		return departmentDao.deleteEmployee(id);
	}
	
	

}
