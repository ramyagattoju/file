package com.svk.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.svk.customer.Customer;
import com.svk.service.CustomerService;

public class CustomerController extends AbstractController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		
		ModelAndView mv = new ModelAndView();
		
		CustomerService cs = new CustomerService();
		List<Customer> custDetails = cs.getCustomerDetails();
		
		mv.addObject("custInfo", custDetails);
		mv.setViewName("customerJsp");
		
		
		return mv;
	}
	
	

}
