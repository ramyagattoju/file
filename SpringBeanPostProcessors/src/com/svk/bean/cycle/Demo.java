package com.svk.bean.cycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Spring-beans.xml");
		
		 Customer cust = (Customer)context.getBean("customer");
		 System.out.println("Customer Name :" +cust.getCustomerName());
		 context.registerShutdownHook();
	}

}
