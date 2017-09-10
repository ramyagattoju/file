package com.svk.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-beans.xml");
		
		 Company sa1 = (Company)context.getBean("svk");
		
		 System.out.println("Employee name : " +sa1.getEmployeeName("emp"));
		
	}

}
