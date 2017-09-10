package com.svk.core.records;

import com.svk.core.address.Address;
import com.svk.core.student.Student;

public class StudentRecord {
	

	
	
	public static void main(String[] args){
		
		
		Address addressObject = new Address();
		addressObject.city = "chicago";
		addressObject.state = "illinois";
		
		
		Student studentObject = new Student("steve",25,addressObject);
		
		System.out.println("Student name is :" +studentObject.name);
		System.out.println("Student rollNumber is :" +studentObject.rollNumber);
		System.out.println("Student city is :" +addressObject.city);
		System.out.println("Student state is :" +addressObject.state);
		
		
		
		double studentPercentage = studentObject.calculatePercentage(89, 99, 79);
		
		System.out.println("Percentage is :" +studentPercentage);
		
		
		
		studentObject.mathsMarks = 99;
		studentObject.scienceMarks = 95;
		studentObject.socialMarks = 91;
		
		double studentAverage  = studentObject.caluculateAverge();
		
		System.out.println("Average is :" +studentAverage);
		
		
		int avg =addressObject.calAvg();
		
		System.out.println("AVg is :" +avg);
		
		
		
		
	}

}
