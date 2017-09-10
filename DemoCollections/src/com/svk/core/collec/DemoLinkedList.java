package com.svk.core.collec;

import java.util.LinkedList;



public class DemoLinkedList {
	
	public static void main(String[] args){
		
		Customer customer1 = new Customer(12,"Steve",12.31);
		Customer customer2 = new Customer(12,"raj",12.31);
		Customer customer3 = new Customer(12,"john",12.31);
		Customer customer4 = new Customer(12,"mike",12.31);
		Customer customer5 = new Customer(12,"ron",12.31);
		
		Customer customer6 = new Customer(12,"Bob",12.31);
		
		LinkedList<Customer> customerList = new LinkedList<Customer>();
		
		customerList.add(customer1);
		customerList.add(customer2);
		customerList.add(customer3);
		customerList.add(customer4);
		customerList.add(customer5);
		
		for(Customer cust :customerList ){
			
			System.out.println("Customer Name :" +cust.getCustomerName());
			System.out.println("Customer Id :" +cust.getCustomerId());
			System.out.println("Customer Balance :" +cust.getCustomerBalance());
			
		}
		
		//trying to retrieve the object on 3rd index
		
		String name = customerList.get(3).getCustomerName();
		int i = customerList.get(3).getCustomerId();
		double bal = customerList.get(3).getCustomerBalance();
		
		System.out.println("*****Customer Name :" +name);
		System.out.println("*****Customer Id :" +i);
		System.out.println("*****Customer Balance :" +bal);
		
		customerList.set(2, customer6);
		
		
	for(Customer cust :customerList ){
			
			System.out.println("________Customer Name :" +cust.getCustomerName());
			System.out.println("_________Customer Id :" +cust.getCustomerId());
			System.out.println("__________Customer Balance :" +cust.getCustomerBalance());
			
		}
		
		
	}

}
