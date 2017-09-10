package com.svk.bean.life;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-beans.xml");
		
		 SimpleAware sa1 = (SimpleAware)context.getBean("svksys");
		 SimpleAware sa2 = (SimpleAware)context.getBean("lit");
		
	}

}
