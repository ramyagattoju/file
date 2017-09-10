package com.svk.core.collec;


import java.util.LinkedHashSet;
import java.util.TreeSet;

public class DemoLinkedHashSet {
	
public static void main(String[] arg){
		
		TreeSet<String> lsetElements = new TreeSet<String>();
 		
		lsetElements.add("ron");
		lsetElements.add("john");
		lsetElements.add("steve");
		lsetElements.add("mike");
		lsetElements.add("patrick");
		lsetElements.add("patrick");
		lsetElements.add("patrick");
		lsetElements.add("mike");
		lsetElements.add("mike");
		lsetElements.add("mike");
		
		
		
		for(String hsEle : lsetElements){
			System.out.println("Elements of Linked HashSet are :   " +hsEle);
		}
		
		System.out.println("Size of my Hashset    " +lsetElements.size());
		
		lsetElements.remove("mike");
		
		for(String hsEle : lsetElements){
			System.out.println("Elements of HashSet After Removal are :   " +hsEle);
		}
		
		
	}

}
