package com.svk.demo;

public class Demo {

	public static void main(String[] args) {
		
		Animal lion = new Dog();
		AnimalSounds as = new AnimalSounds();
		
		as.setAnimal(lion);
		as.hearSounds();

	}

}
