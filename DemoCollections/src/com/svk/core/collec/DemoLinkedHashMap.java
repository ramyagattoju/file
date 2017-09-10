package com.svk.core.collec;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class DemoLinkedHashMap {

	
	public static void main(String[] args) {
		
		//Key - Value Pair
		
		Map<String,Integer> studentMarks = new LinkedHashMap<String, Integer>();
		
		studentMarks.put("Ron" ,25);
		studentMarks.put("Steve", 35);
		studentMarks.put("Patrick",45);
		
		for(String keyOfStudentMarks : studentMarks.keySet()){
			
			System.out.println("Keys of my Map are :" +keyOfStudentMarks);
			
			
		}
		
		
		Iterator<String> itsm = studentMarks.keySet().iterator();
		
		while(itsm.hasNext()){
			System.out.println("&&&&&&&&&&&&& Values : " +itsm.next());
		}
		
		for(Integer valuesOfStudentMarks : studentMarks.values()){
			System.out.println("Keys of my Map are :" +valuesOfStudentMarks);
			
		}
		
	}
}
