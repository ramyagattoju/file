package com.svk.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("svk-spring.xml");
		
		
		//Animal aniiii = new Animal();
		//aniiii.setAnimalName("something");
		
		
		Animal an = (Animal)context.getBean("myAnimal");
		an.makeSound();
		an.tellAnimalName();
		an.foodType();
		an.foodAndLegs();
	}

}
