package com.svk.bean.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("svk-spring.xml");
		
		Customer an = (Customer)context.getBean("praveenCustomer");
		an.setCustomerName("praveen");
		an.customerDetails();
			
	}

}
