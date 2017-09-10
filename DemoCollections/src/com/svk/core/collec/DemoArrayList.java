package com.svk.core.collec;

import java.util.ArrayList;

public class DemoArrayList {
	
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
		customer4.setCustomerId(789);
		customer4.setCustomerName("Ron");
		customer4.setCustomerBalance(45.12);
		
		Customer customer5 = new Customer();
		customer5.setCustomerId(789);
		customer5.setCustomerName("Ron");
		customer5.setCustomerBalance(45.12);
		
		Customer customer6 = new Customer();
		customer6.setCustomerId(789);
		customer6.setCustomerName("Ron");
		customer6.setCustomerBalance(45.12);
		
		Customer customer7 = new Customer();
		customer7.setCustomerId(789);
		customer7.setCustomerName("Ron");
		customer7.setCustomerBalance(45.12);
		
		Customer customer8 = new Customer();
		customer8.setCustomerId(789);
		customer8.setCustomerName("Ron");
		customer8.setCustomerBalance(45.12);
		
		Customer customer9 = new Customer();
		customer9.setCustomerId(789);
		customer9.setCustomerName("Ron");
		customer9.setCustomerBalance(45.12);
		
		Customer customer10 = new Customer();
		customer10.setCustomerId(789);
		customer10.setCustomerName("Ron");
		customer10.setCustomerBalance(45.12);
		
		Customer customer11 = new Customer();
		customer11.setCustomerId(789);
		customer11.setCustomerName("Ron");
		customer11.setCustomerBalance(45.12);
		
		Customer customer12 = new Customer();
		customer12.setCustomerId(789);
		customer12.setCustomerName("Ron");
		customer12.setCustomerBalance(45.12);
		
		Customer customer13 = new Customer();
		customer13.setCustomerId(789);
		customer13.setCustomerName("Ron");
		customer13.setCustomerBalance(45.12);
		
		ArrayList<Customer> customerArrayList = new ArrayList<Customer>();
		
		customerArrayList.add(customer1);
		customerArrayList.add(customer2);
		customerArrayList.add(customer3);
		customerArrayList.add(customer4);
		customerArrayList.add(customer5);
		customerArrayList.add(customer6);
		customerArrayList.add(customer7);
		customerArrayList.add(customer8);
		customerArrayList.add(customer9);
		customerArrayList.add(customer10);
		customerArrayList.add(customer11);
		customerArrayList.add(customer12);
		customerArrayList.add(customer13);
		
		System.out.println("Size of my customer array List is :" +customerArrayList.size());
		
		for(Customer customerLooping : customerArrayList){
			
			System.out.println("Customer Name :" +customerLooping.getCustomerName());
			System.out.println("Customer Id :" +customerLooping.getCustomerId());
			System.out.println("Customer Balance :" +customerLooping.getCustomerBalance());
			
		}
		
		
		
		customerArrayList.remove(4);
		customerArrayList.remove(10);
		customerArrayList.remove(2);
		customerArrayList.remove(7);
		customerArrayList.remove(8);
		
		System.out.println("Size of my customer array List is :" +customerArrayList.size());
		
	for(Customer customerLooping : customerArrayList){
			
			System.out.println("****Customer Name :" +customerLooping.getCustomerName());
			System.out.println("****Customer Id :" +customerLooping.getCustomerId());
			System.out.println("*****Customer Balance :" +customerLooping.getCustomerBalance());
			
		}
	
	
	String name = customerArrayList.get(3).getCustomerName();
	int i = customerArrayList.get(3).getCustomerId();
	double bal = customerArrayList.get(3).getCustomerBalance();
	
	System.out.println("%%%%%Customer Name :" +name);
	System.out.println("%%%%%Customer Id :" +i);
	System.out.println("&&&&&&Customer Balance :" +bal);
		
}

}
