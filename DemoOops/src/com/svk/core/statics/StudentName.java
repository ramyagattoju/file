package com.svk.core.statics;

public class StudentName {

	public static void main(String[] args) {
		
		
    Student studentObject = new Student();
	String name = 	studentObject.displayStudentName();
	System.out.println("Name of Student :" +name);

	int rank = Student.displayRank();
	
	System.out.println("Rank is : " +rank);
	
	}

}
