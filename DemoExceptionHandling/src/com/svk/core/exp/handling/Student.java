package com.svk.core.exp.handling;

public class Student {
	
	private String studentName;

	public String getStudentName() throws NullPointerException{
		
		throw new NullPointerException();
		//return this.studentName;
		
	}
	
	public void setStudentName(String name){
		this.studentName = name;
	}
}
