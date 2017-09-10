package com.svk.spring;

import java.util.ArrayList;
import java.util.List;

public class DemoWithoutDI {

	public static void main(String[] args) {
		
		//Animal ani = new Animal();
		//ani.makeSound();
		
		Animal ani = new Animal();
		ani.setAnimalName("Lion");
		ani.tellAnimalName();
		
		
		List<String> myList = new ArrayList<String>();

	}

}
