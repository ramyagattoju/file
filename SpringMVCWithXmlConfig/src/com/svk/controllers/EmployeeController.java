package com.svk.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.svk.employee.Employee;
import com.svk.service.EmployeeService;

public class EmployeeController extends AbstractController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		
		ModelAndView mv = new ModelAndView();
		
		EmployeeService es = new EmployeeService();
		
		
		List<Employee> empDetails = es.getEmployeeDetails();
		
		mv.addObject("employeeInfo", empDetails);
		mv.setViewName("employeeJsp");
		
		
		return mv;
	}
	

}
