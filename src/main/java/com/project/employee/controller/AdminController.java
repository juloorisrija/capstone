package com.project.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.project.employee.model.StatusReport;
import com.project.employee.model.User;
import com.project.employee.service.EmployeeService;
import com.project.employee.service.StatusReportService;

@Controller
@RequestMapping("/")
public class AdminController {

	@Autowired
	EmployeeService service;
	StatusReportService service1;

	@RequestMapping(value="/dashboard",method=RequestMethod.POST)
	public String printGreet(ModelMap map,@ModelAttribute("user")User user) {
		if(service.validate(user.getUserId(),user.getPassword())) {
		
			return "dashboard";
		
		}
		else {
			map.addAttribute("error" ,"Incorrect credentials!!..");
			return "login";
		}
	}
	@RequestMapping(value="dashboard",method=RequestMethod.GET)
	public String home2() {
		return "dashboard";
	}
	
	@RequestMapping(value="login",method=RequestMethod.GET)
	public String home() {
		return "login";
	}
	
	@RequestMapping(value="employeeDashboard",method=RequestMethod.GET)
	public String home1() {
		return "employeeDashboard";
	}
	
	@RequestMapping(value="departmentDashboard",method=RequestMethod.GET)
	public String depart() {
		return "departmentDashboard";
	}
	
	@RequestMapping(value="complianceDashboard",method=RequestMethod.GET)
	public String comp() {
		return "complianceDashboard";
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public String homepage() {
		return "home";
	}
//	@RequestMapping(value="/addStatus", method = RequestMethod.POST)
//	public String addStatus(ModelMap map, @ModelAttribute("status") StatusReport status, @PathVariable("userId") Integer userid) {
//		System.out.println("hello");
//		map.addAttribute("id", userid);
//		boolean flag = service1.addStatus(status);
//		
//		if(flag) {
//			map.addAttribute("msg", "status created Successfully!!");
//			return "addStatus";
//		}
//		else {
//			map.addAttribute("msg", "Error in creating new status!!");
//			return "addStatus";
//		}
//		
//		
//	}
//
//	@RequestMapping(value="/addStatus", method = RequestMethod.GET)
//	public String addStatusPage() {
//		System.out.println("hello1");
//			return "addStatus";
//	
	//}
	
//	@RequestMapping(value="/employeeDetails",method=RequestMethod.GET)
//	public String home1() {
//		return "employeeDetails";
//	}
	

//	@RequestMapping(value="/dashboard1",method=RequestMethod.POST)
//	public String printGreet(ModelMap map,@ModelAttribute("user")User user) {
//		if(service.validate(user.getUserId(),user.getPassword())) {
//		
//			return "dashboard1";
//		
//		}
//		else {
//			map.addAttribute("error" ,"Incorrect credentials!!..");
//			return "dummy";
//		}
//	}
//	@RequestMapping(method=RequestMethod.GET)
//	public String home() {
//		return "dummy";
//	}
	

}
