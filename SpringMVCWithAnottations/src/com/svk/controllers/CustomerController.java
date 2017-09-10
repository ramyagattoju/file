package com.svk.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.svk.customer.Customer;
import com.svk.service.CustomerService;

@Controller
@RequestMapping("/customerRef.htm")
public class CustomerController{
	
	@Autowired
	HibernateTemplate templ;
	
	@Autowired
	CustomerService cs;

	@RequestMapping(method = RequestMethod.GET)
	public String printCustomerInformation(ModelMap model) throws Exception {
		
		List<Customer> custDetails = cs.getCustomerDetails();
		model.addAttribute("custInfo",custDetails);
		
		return "customerJsp";
	}
	
	

}

