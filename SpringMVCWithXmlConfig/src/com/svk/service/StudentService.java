package com.svk.service;

import java.util.ArrayList;
import java.util.List;

import com.svk.Student.Student;

public class StudentService {
	
	public List<Student> getStudentDetails(){
		
		List<Student> studList = new ArrayList<Student>();
		
		Student stu1  =  new Student();
		
		stu1.setRollNumber(10);
		stu1.setStudentName("paula");
		
		Student stu2  =  new Student();
		
		stu2.setRollNumber(20);
		stu2.setStudentName("paul");
		
		Student stu3  =  new Student();
		
		stu3.setRollNumber(30);
		stu3.setStudentName("gary");
		
		studList.add(stu1);
		studList.add(stu2);
		studList.add(stu3);
		
		return studList;
	}

}
