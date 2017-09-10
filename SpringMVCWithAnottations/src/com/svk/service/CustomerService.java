package com.svk.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.svk.customer.Customer;

@Service
public class CustomerService {
	
	public List<Customer> getCustomerDetails(){
		
		List<Customer> custList = new ArrayList<Customer>();
		
		Customer cust1 = new Customer();
		
		cust1.setCustomerName("sarah");
		cust1.setBalance(1000);
		
		Customer cust2 = new Customer();
		
		cust2.setCustomerName("patrick");
		cust2.setBalance(2000);
		
		Customer cust3 = new Customer();
		
		cust3.setCustomerName("chris");
		cust3.setBalance(3000);
		
		
		custList.add(cust1);
		custList.add(cust2);
		custList.add(cust3);
		
		return custList;
		
	}

}
