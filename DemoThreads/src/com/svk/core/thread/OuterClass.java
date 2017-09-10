package com.svk.core.thread;

public class OuterClass {
	
	public String name = "smith";
	
	
	public void createInnerClassObject(){
	
	InnerClass innerClass = new InnerClass();
	
	innerClass.getMyName();
	
	
	
	}
	

	
	public class InnerClass{
		
		public void getMyName(){
			System.out.println(" Name is : " +name);
		}
		
	}
}
