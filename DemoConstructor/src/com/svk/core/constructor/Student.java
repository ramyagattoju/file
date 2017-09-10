package com.svk.core.constructor;

public class Student {
	
	String name;
	int rollNumber;
	int rank;
	
	Student(){
		
	}
	

	Student(String studentName,int studenRollNumber){
		name = studentName;
		rollNumber = studenRollNumber;
		
	}
	

	Student(String studentNameWithThreeParams,int studenRollNumberWithThreeParam,int studentRank){
		
		this(studentNameWithThreeParams,studenRollNumberWithThreeParam);
		this.rank = studentRank;
	}
	
}
