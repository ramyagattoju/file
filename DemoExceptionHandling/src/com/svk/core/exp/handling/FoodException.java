package com.svk.core.exp.handling;

public class FoodException extends Exception{
	
	public  FoodException(String message){
		super(message);
		System.out.println("Inside Custom Exception Class");
	
	}

}
