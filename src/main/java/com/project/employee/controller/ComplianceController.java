package com.project.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.project.employee.model.Compliance;
import com.project.employee.model.Employee;
import com.project.employee.model.StatusReport;
import com.project.employee.service.ComplianceService;
import com.project.employee.service.StatusReportService;



@Controller
@RequestMapping("/compliance")
public class ComplianceController {

	@Autowired
    ComplianceService service;
	
	@RequestMapping(value="/all", method = RequestMethod.GET)
	public String getAllCompliances(ModelMap map) {
		
		//System.out.println("all");
		List<Compliance> comList = service.getAllCompliance();
		
		map.addAttribute("complianceList", comList);
		
		return "viewTotalCompliance";
		
	}
	@RequestMapping(value="/add", method = RequestMethod.POST)
	public String addCompliance(ModelMap map, @ModelAttribute("compliance") Compliance compliance) {
		//System.out.println("hello form add");
		boolean flag = service.addCompliance(compliance);
		System.out.println(flag);
		if(flag) {
			map.addAttribute("msg", "Compliance Added Successfully!!");
			return "addCompliance";
		}
		else {
			map.addAttribute("msg", "Error in Adding new compliance!!");
			return "addCompliance";
		}
		
		
	}

	@RequestMapping(value="/add", method = RequestMethod.GET)
	public String addCompliancePage() {
		
			return "addCompliance";
	
	}
	
	@RequestMapping(value="/update/{complianceId}/{details}/{date1}/{departId}/{emplcount}/{status1}/{userId}", method = RequestMethod.GET)
	public String update(ModelMap map, @PathVariable("complianceId") Integer complianceId, @PathVariable("details") String details,@PathVariable("date1") String date1, @PathVariable("departId") String departId, 
		@PathVariable("emplcount") String emplcount,@PathVariable("status1") String status1,@PathVariable("userId") Integer  userId) {
			
			map.addAttribute("complianceId", complianceId);
			map.addAttribute("details", details);
			map.addAttribute("date1", date1);
			map.addAttribute("departId", departId);
			map.addAttribute("emplcount", emplcount);
			map.addAttribute("status1", status1);
			map.addAttribute("userId", userId);
			//System.out.println("iam in pdate3 ");
			return "updateCompliance";
		
			
		}
		@RequestMapping(value="/update",method=RequestMethod.POST)
		String updateCompliance(ModelMap map,@ModelAttribute("compliance") Compliance compliance) {
			//System.out.println("iam in pdate2 ");
			if(service.updateCompliance(compliance)) {
				//System.out.println("iam in pdate1 ");
				map.addAttribute("updateMsg", "Compliance Updated Successfully!!");
				
				return "updateCompliance";
			}
			else {
				map.addAttribute("updateMsg", "Complinace Not Updated!!");
				return "addCompliance";
			
		}

		}
		
}
