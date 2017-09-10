package com.svk.core.exp.handling;

public class StudentEnrollment {
	
	public void checkEligibility(int age){
		
		if(age < 10){
			System.out.println("Your kid is under 10 Years\n");
			throw new ArithmeticException("Student cannot be entrolled");
		}
		
		System.out.println("Student got Enrolled");
		
	}

}
