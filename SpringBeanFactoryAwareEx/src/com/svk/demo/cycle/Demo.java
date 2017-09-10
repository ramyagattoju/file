package com.svk.demo.cycle;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-beans.xml");
		
		 Company sa1 = (Company)context.getBean("india");
		
		 sa1.initialized();
		
	}

}
