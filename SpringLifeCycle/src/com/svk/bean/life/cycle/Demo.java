package com.svk.bean.life.cycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Spring-beans.xml");
		
		System.out.println("*******Before context load******************");
		
		Country con1 = (Country)context.getBean("country");
		
		System.out.println("*******After context load******************");
		
		con1.putContryName("India");
		con1.printCountryName();
		
		context.registerShutdownHook();
		
		
	}

}
