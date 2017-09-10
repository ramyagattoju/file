package com.svk.spring;

public class Animal {
	
	String food;
	int noOfLegs;
	String animalName;
	
	public Animal(){
		
	}
	
	 public Animal(String food,int noOfLegs){
		this.food = food;
		this.noOfLegs = noOfLegs;
	}
	
	public int getNoOfLegs() {
		return noOfLegs;
	}

	
	
	public void setAnimalName(String name){
		this.animalName = name;
	}
	
	
	
	public void makeSound(){
		System.out.println("Animals make sound");
	}
	
	public void tellAnimalName(){
		System.out.println("Animal is :" +animalName);
	}
	
	
	
	
	
	public void foodType(){
		System.out.println("Food Type from Constructor :" +getFood());
	}
	
	public void foodAndLegs(){
		System.out.println("Food :  " +getFood() +" Legs : " +getNoOfLegs());
	}



	public String getFood() {
		return food;
	}

}
