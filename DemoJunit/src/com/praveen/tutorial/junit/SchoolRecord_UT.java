package com.praveen.tutorial.junit;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SchoolRecord_UT {
	
	
	AnotherSchoolRecord asr = new AnotherSchoolRecord();
	
	SchoolRecord sr = new SchoolRecord(asr);

	@Test
	public void test_happyPathTest() {
		
		
	int result = 	sr.totalStudent(getSchoolDetails());
	
	    assertNotNull(result);
		assertEquals(160, result);
		
	}
	
	@Test
	public void test_exceptionTest() {
		
		 
	int result = 	sr.totalStudent(null);
	assertNotNull(result);	
		assertEquals(100, result);
		
	}
	
	@Test
	public void test_happyPathTest_with4thGrade() {
		
		
	int result = 	sr.totalStudent(getSchoolDetailsFor4ThGrade());
	
	 assertNotNull(result);
		assertEquals(600, result);
		
	}
	
	
	
	

	private List<School> getSchoolDetails() {
		List<School> listOfSchool = new ArrayList<School>();
		
		School sc1 = new School();
		sc1.setGrade("1st");
		sc1.setNoOfStudents(20);
		
		School sc2 = new School();
		sc2.setGrade("2nd");
		sc2.setNoOfStudents(10);
		
		School sc3 = new School();
		sc3.setGrade("3rd");
		sc3.setNoOfStudents(30);
		
		School sc4 = new School();
		sc4.setGrade("4th");
		sc4.setNoOfStudents(40);
		
		listOfSchool.add(sc1);
		listOfSchool.add(sc2);
		listOfSchool.add(sc3);
	//	listOfSchool.add(sc4);
		
		return listOfSchool;
	}

	
	private List<School> getSchoolDetailsFor4ThGrade() {
		List<School> listOfSchool = new ArrayList<School>();
		
		
		School sc4 = new School();
		sc4.setGrade("4th");
		sc4.setNoOfStudents(40);
		
		
		listOfSchool.add(sc4);
		
		return listOfSchool;
	}

}
