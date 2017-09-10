package com.svk.bean.annotations;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component(value = "praveenCustomer")
public class Customer {
	
	
	private String customerName;
	
	@Autowired
	private Address address;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public void customerDetails(){
		
		address.setCity("atlanta");
		address.setState("Georgia");
		System.out.println("Customer name :" +getCustomerName() + " Address : "  +address.getCity() + "  " +address.getState());
	}
	

}
