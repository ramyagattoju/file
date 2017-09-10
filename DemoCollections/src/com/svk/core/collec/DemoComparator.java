package com.svk.core.collec;

import java.util.ArrayList;
import java.util.Collections;

public class DemoComparator {
	
public static void main(String[] args) {
		
	StudentForComparator student1 = new StudentForComparator("Ron", 150);
	StudentForComparator student2 = new StudentForComparator("steve", 250);
	StudentForComparator student3 = new StudentForComparator("mike", 190);
	StudentForComparator student4 = new StudentForComparator("john", 420);
	StudentForComparator student5 = new StudentForComparator("paul", 90);
		
		ArrayList<StudentForComparator> studentList = new ArrayList<StudentForComparator>();
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		studentList.add(student5);
		
		System.out.println("Elements Before Sorting");
		
		for(StudentForComparator ele :studentList ){
			
			System.out.println("Student : " +ele.getStudentName() +" has Weight : " +ele.getStudentWeight());
		}
		
		Collections.sort(studentList, new WeightComparator());
		
		System.out.println("Elements After Sorting");
		
		for(StudentForComparator ele :studentList ){
			
			System.out.println("Student : " +ele.getStudentName() +" has Weight : " +ele.getStudentWeight());
			
		}
		
		
		
	}


}
