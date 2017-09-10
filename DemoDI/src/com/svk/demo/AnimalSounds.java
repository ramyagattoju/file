package com.svk.demo;

public class AnimalSounds {
	
	private Animal animal;

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	
	public void hearSounds(){
		animal.sound();
	}

}
