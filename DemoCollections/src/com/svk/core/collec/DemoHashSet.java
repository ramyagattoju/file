package com.svk.core.collec;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class DemoHashSet {
	
	public static void main(String[] arg){
		
		TreeSet<String> hsetElements = new TreeSet<String>();
		
		hsetElements.add("ron");
		hsetElements.add("john");
		hsetElements.add("steve");
		hsetElements.add("mike");
		hsetElements.add("patrick");
		hsetElements.add("patrick");
		hsetElements.add("patrick");
		hsetElements.add("mike");
		hsetElements.add("mike");
		hsetElements.add("mike");
		
		Iterator<String> iter = hsetElements.iterator();
		
		
		for(String hsEle : hsetElements){
			System.out.println("Elements of HashSet are :   " +hsEle);
		}
		
		System.out.println("Size of my Hashset    " +hsetElements.size());
		
		hsetElements.remove("mike");
		
		for(String hsEle : hsetElements){
			System.out.println("Elements of HashSet After Removal are :   " +hsEle);
		}
		
		
	}

}
