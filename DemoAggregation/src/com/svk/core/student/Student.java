package com.svk.core.student;

import com.svk.core.address.Address;

public class Student {
	
	public  String name;
	public int rollNumber;
	
	public int mathsMarks;
	public int scienceMarks;
	public int socialMarks;
	
	
   public Address address;
    
    
	
	public Student(String studentName,int studentRollNum,Address studentAddress){
		this.name = studentName;
		this.rollNumber = studentRollNum;
		this.address = studentAddress;
	}
	
	
	public double calculatePercentage(int mathsMarks,int scienceMarks,int socialMarks){
		
		int totalMarks = mathsMarks+scienceMarks+socialMarks;
		double percentage = (totalMarks*100)/300;
		
		return percentage;
		
	}
	
	public double caluculateAverge(){
		
		double average = (mathsMarks+scienceMarks+socialMarks)/3;
		return average;
	}
	
	

}
