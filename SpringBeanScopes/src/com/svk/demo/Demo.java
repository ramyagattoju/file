package com.svk.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-beans.xml");
		
		Country con1 = (Country)context.getBean("country");
		
		con1.putContryName("India");
		con1.printCountryName();
		
		Country con2 = (Country)context.getBean("country");
		
		
		con2.printCountryName();
	}

}
