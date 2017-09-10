package com.svk.core.collec;

import java.util.ArrayList;
import java.util.Collections;

public class DemoComparable {

	public static void main(String[] args) {
		
		Student student1 = new Student("Ron", 150);
		Student student2 = new Student("steve", 250);
		Student student3 = new Student("mike", 190);
		Student student4 = new Student("john", 120);
		Student student5 = new Student("paul", 90);
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		studentList.add(student5);
		
		System.out.println("Elements Before Sorting");
		
		for(Student ele :studentList ){
			
			System.out.println("Student : " +ele.getStudentName() +" has Weight : " +ele.getStudentWeight());
		}
		
		Collections.sort(studentList);
		
		System.out.println("Elements after Sorting ");
		
		for(Student ele :studentList ){
			
			System.out.println("Student : " +ele.getStudentName() +" has Weight : " +ele.getStudentWeight());
		}
		
	}

}
