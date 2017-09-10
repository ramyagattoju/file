package com.svk.core.oops;

public class Student {

	public void studentMethod(){
		System.out.println("I am inside a Student Method with No Args");
	}
	
	
	//Method Overloading
	public void studentMethod(String name){
		System.out.println("Student name is :" +name);
	}
	
	//Method Overloading
	public void studentMethod(String name,int rollNumber){
		System.out.println("Student name is :" +name + " with ROll Number :" +rollNumber);
	}
	
	
}
