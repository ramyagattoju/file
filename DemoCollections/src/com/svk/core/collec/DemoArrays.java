package com.svk.core.collec;

import java.util.ArrayList;

public class DemoArrays {

	
	public static void main(String[] arg){
		
		
		Customer customer1 = new Customer();
		customer1.setCustomerId(123);
		customer1.setCustomerName("Justin");
		customer1.setCustomerBalance(23.12);
		
		Customer customer2 = new Customer();
		customer2.setCustomerId(456);
		customer2.setCustomerName("Steve");
		customer2.setCustomerBalance(33.12);
		
		
		Customer customer3 = new Customer();
		customer3.setCustomerId(789);
		customer3.setCustomerName("Ron");
		customer3.setCustomerBalance(45.12);
		
		Customer customer4 = new Customer();
		customer4.setCustomerId(111);
		customer4.setCustomerName("chris");
		customer4.setCustomerBalance(4.12);
		
		
		
		Customer[] customerArray = new Customer[3];
		
		customerArray[0] = customer1;
		customerArray[1] = customer2;
		customerArray[2] = customer3;
		//customerArray[3] = customer4;
		
		for(int i = 0 ;i <3 ;i++){
			
		//	System.out.println("Customer Name :" +customerArray[i].getCustomerName());
		//	System.out.println("Customer Id :" +customerArray[i].getCustomerId());
		//	System.out.println("Customer Balance :" +customerArray[i].getCustomerBalance());
		}
		
		ArrayList arr = new ArrayList();
		
		arr.add(customer1);
		arr.add("123");
		
		for(Object arra: arr){
			System.out.println(arra.toString());
		}
		
		
		
	}
}
