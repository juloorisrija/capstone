package com.project.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.project.employee.model.StatusReport;
import com.project.employee.service.StatusReportService;


@Controller
@RequestMapping("/status")
public class StatusReportController {
	
	@Autowired
	StatusReportService service;
	
	@RequestMapping(value="/all", method = RequestMethod.GET)
	public String getAllstatus(ModelMap map) {
		
		
		List<StatusReport> statusList = service.getAllStatus();
		
		map.addAttribute("StatusReportList",statusList);
		
		return "viewStatus";
		
	}
//	@RequestMapping(value="/addStatus", method = RequestMethod.POST)
//	public String addStatus(ModelMap map, @ModelAttribute("status") StatusReport status) {
//		System.out.println("hello");
//		boolean flag = service.addStatus(status);
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
//	}

}
