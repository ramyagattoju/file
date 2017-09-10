package com.svk.core.collec;

import java.io.Serializable;

public class Customer implements Serializable{
	
	private int customerId;
	private String customerName;
	private double customerBalance;
	
	public Customer(){
		
	}
	
	
	public Customer(int customerId, String customerName, double customerBalance) {
		
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerBalance = customerBalance;
	}
	
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getCustomerBalance() {
		return customerBalance;
	}
	public void setCustomerBalance(double customerBalance) {
		this.customerBalance = customerBalance;
	}
	

}
