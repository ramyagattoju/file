package com.svk.core.collec;

import java.io.Serializable;

public class StudentForComparator implements Serializable{
	
	private String studentName;
	private int studentWeight;
	
	public StudentForComparator(String studentName, int studentWeight) {
		
		this.studentName = studentName;
		this.studentWeight = studentWeight;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentWeight() {
		return studentWeight;
	}

	public void setStudentWeight(int studentWeight) {
		this.studentWeight = studentWeight;
	}
	
	
	
}
