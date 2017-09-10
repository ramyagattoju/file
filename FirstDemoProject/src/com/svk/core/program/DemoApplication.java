package com.svk.core.program;

public class DemoApplication {
	
	public void demoMyMethod(){
		
		System.out.println("Hey I'm called inside a method");
	}
	
	public static void main(String[] args){
	
	System.out.println("This is my first Project");
	
	DemoApplication demoMyCollege = new DemoApplication();
	demoMyCollege.demoMyMethod();
	
	}

}
