package com.svk.core.constructor;

public class StudentRecord {

	public static void main(String[] args) {
		
		Student firstStudent = new Student();
		
		firstStudent.name = "chris";
		firstStudent.rollNumber =20;
		
		Student secondStudent = new Student();
		
		secondStudent.name = "tom";
		secondStudent.rollNumber = 25;
		
		Student thirdStudent = new Student("steve",30);
		thirdStudent.rank = 5;
		
		Student fourthStudent = new Student("mike", 35);
		fourthStudent.rank = 10;
		
		
		Student fifthStudent = new Student("ron" , 40,15);
		
		System.out.println("First Student Name is : " +firstStudent.name);
		System.out.println("First Student Roll Number is : " +firstStudent.rollNumber);
			
		System.out.println("Second Student Name is : " +secondStudent.name);
		System.out.println("Second Student Roll Number is : " +secondStudent.rollNumber);
		
		System.out.println("Third  Student Name is : " +thirdStudent.name);
		System.out.println("Third Student Roll Number is : " +thirdStudent.rollNumber);
		System.out.println("Third Student Rannk is : " +thirdStudent.rank);
		
		System.out.println("fourthStudent  Student Name is : " +fourthStudent.name);
		System.out.println("fourthStudent Student Roll Number is : " +fourthStudent.rollNumber);
		System.out.println("fourthStudent  Student Rank is : " +fourthStudent.rank);
		
		System.out.println("FifthStudent Name :" +fifthStudent.name);
		System.out.println("FifthStudent RollNumber :" +fifthStudent.rollNumber);
		System.out.println("FifthStudent Rank :" +fifthStudent.rank);
	}

}
