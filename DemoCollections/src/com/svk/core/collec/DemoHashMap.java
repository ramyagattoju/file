package com.svk.core.collec;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;



public class DemoHashMap {

	public static void main(String[] args) {
		
		//Key - Value Pair
		
		Map<String,Integer> studentMarks = new HashMap<String, Integer>();
		
		studentMarks.put("Ron" ,25);
		studentMarks.put("Steve", 35);
		studentMarks.put("Patrick",45);
		
		for(Entry<String,Integer> it : studentMarks.entrySet()){
			System.out.println(it.getKey() + "******" +it.getValue());
		}
		
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
		
		Integer valueOfSteve = studentMarks.get("Steve");
		
		System.out.println("Value for Key Steve :" +valueOfSteve);
		System.out.println("Value for Key Ron :" +studentMarks.get("Ron"));
		System.out.println("Value for Key Patrick :" +studentMarks.get("Patrick"));
		
	
		Map<String,String> stateAndCity = new HashMap<String, String>();
		
		stateAndCity.put("Illinois","chicago");
		stateAndCity.put("Illinois","peoria");
		stateAndCity.put("Illinois", "springfield");
		stateAndCity.put("Illinois","peoria");
		stateAndCity.put("Illinois","peoria");
		stateAndCity.put("Illinois","peoria");
		stateAndCity.put("Illinois","peoria");
		
		System.out.println("City is :" +stateAndCity.get("Illinois"));
		
		for(String stateAndCityhhh : stateAndCity.keySet()){
			
			System.out.println("Keys of my Map *******are :" +stateAndCityhhh);
			
			
		}
      for(String stateAndCityhhh : stateAndCity.values()){
			
			System.out.println("values of my Map *******are :" +stateAndCityhhh);
			
			
		}
		
		
		
		
		
	

	}

}
