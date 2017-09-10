package com.svk.core.collec;

public class Student implements Comparable<Student>{
	
	private String studentName;
	private int studentWeight;
	
	public Student(String studentName, int studentWeight) {
		
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

	@Override
	public int compareTo(Student stu) {
		
		if(this.getStudentWeight() > stu.getStudentWeight()){
			return 1;
		} 
		
		else if(this.getStudentWeight() < stu.getStudentWeight()){
			return -1;
		}
		
		else	
		return 0;
	}
	
	

}
