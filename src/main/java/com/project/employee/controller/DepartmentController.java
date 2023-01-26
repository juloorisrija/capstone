
package com.project.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.project.employee.model.Department;
import com.project.employee.model.Employee;
import com.project.employee.service.DepartmentService;

@Controller
@RequestMapping("/department")
public class DepartmentController {
	
	@Autowired
	DepartmentService service;
	
	@RequestMapping(value="/Alldepart", method = RequestMethod.GET)
	public String getAllDepartment(ModelMap map) {
		
		
		List<Department> deptList = service.getAllDepartments();
		
		map.addAttribute("departmentList", deptList);
		
		return "department";
		
	}
	@RequestMapping(value="/All", method = RequestMethod.GET)
	public String getAllDepartments(ModelMap map) {
		
		
		List<Department> deptList = service.getAllDepartments();
		
		map.addAttribute("departmentList", deptList);
		
		return "viewTotalDepart";
		
	}
	@RequestMapping(value="/addDepart",method=RequestMethod.POST)
	public String addDepartment(ModelMap map, @ModelAttribute("department") Department department) {
		
		boolean flag = service.addDepartment(department);
		
		if(flag) {
			map.addAttribute("msg", "Department Added Successfully!!");
			return "addDepartment";
		}
		else if(service.validate(department.getDepartId())){
			map.addAttribute("msg","invalid department id");
			return "addDepartment";
		}
		else {
			map.addAttribute("msg", "Error in Adding new Department!!");
			return "addDepartment";
		}
	}
		@RequestMapping(value="/addDepart", method = RequestMethod.GET)
		public String addDepartmentPage() {
				return "addDepartment";
		
		}
		
		@RequestMapping(value="/delete/{id}", method = RequestMethod.GET)
		public String delete(ModelMap map, @PathVariable("id") Integer id) {
			
			if(service.deleteEmployee(id)) {
				
				service.deleteDepartment(id);
				System.out.println(service.deleteEmployee(id));
				map.addAttribute("delMsg", "Department Deleted Successfully!!");
				return "department";
			}
			else {
				map.addAttribute("delMsg", "Department Not Deleted!!");
				return "add";
			}
				
		}

		@RequestMapping(value="/count",method=RequestMethod.GET)
		public String count(ModelMap map) {
			int totaldept=service.countDepartment();
			map.addAttribute("msg1", totaldept);
			return "departmentCount";
		}
		
}
