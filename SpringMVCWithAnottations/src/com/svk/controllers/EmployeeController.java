package com.svk.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.svk.employee.Employee;
import com.svk.service.EmployeeService;

@Controller
@RequestMapping("/employeeRef.htm")
public class EmployeeController{

	@Autowired
	EmployeeService es;
	
	@RequestMapping(method = RequestMethod.GET)
	public String printEmployeeInfo(ModelMap model) throws Exception {
		
		List<Employee> empDetails = es.getEmployeeDetails();
		model.addAttribute("employeeInfo", empDetails);
		
		return "employeeJsp";
	}
	

}
