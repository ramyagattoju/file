package com.svk.bean.cycle;

public class Customer {
	
	private String customerName;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public void init(){
		System.out.println("In init method of Customer Class");
	}
	
	public void destroy(){
		System.out.println("In destroy method of Customer Class");
	}
}
