package com.project.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.project.employee.model.StatusReport;
import com.project.employee.service.StatusReportService;

@Controller
@RequestMapping("/")
public class NewController {

	@Autowired
	StatusReportService service1;
	@RequestMapping(value="/addStatus", method = RequestMethod.POST)
	public String addStatus(ModelMap map, @ModelAttribute("status") StatusReport status, @PathVariable("userId") Integer userid) {
		System.out.println("hello");
		map.addAttribute("id", userid);
		boolean flag = service1.addStatus(status);
		
		if(flag) {
			map.addAttribute("msg", "status created Successfully!!");
			return "addStatus";
		}
		else {
			map.addAttribute("msg", "Error in creating new status!!");
			return "addStatus";
		}
		
		
	}

	@RequestMapping(value="/addStatus", method = RequestMethod.GET)
	public String addStatusPage() {
		System.out.println("hello1");
			return "addStatus";
	
}
}
