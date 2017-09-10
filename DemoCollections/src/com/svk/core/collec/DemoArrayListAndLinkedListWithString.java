package com.svk.core.collec;

import java.util.*;

import java.util.ArrayList;



public class DemoArrayListAndLinkedListWithString {

	public static void main(String[] args) {
		
		ArrayList<String> strArrayList = new ArrayList<String>();
		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		
		strArrayList.add("ddd");
		strArrayList.add("ccc");
		strArrayList.add("vvv");
		strArrayList.add("vvv");
		strArrayList.add("vvv");
		strArrayList.add("vvv");
		strArrayList.add("vvv");
		strArrayList.add("vvv");
		
		for(String strindElements :strArrayList ){
			
			System.out.println("Elecments of ArrayList are :" +strindElements);
		}
		
		
		Iterator<String> itArrayList = strArrayList.iterator();
		
		while(itArrayList.hasNext()){
			System.out.println("Elements using Iterator :" +itArrayList.next());
		}
		
		
	
		
		LinkedList<String> strll = new LinkedList<String>();
		
		strll.add("zzz");
		strll.add("yyy");
		strll.add("xxx");
		strll.add("xxx");
		strll.add("xxx");
		strll.add("xxx");
		strll.add("xxx");
		strll.add("xxx");
		
		for(String llElements : strll){
			
			System.out.println("Elecments of LinkedList are :" +llElements);
		}

		Iterator<String> itLinkedList = strll.iterator();
		
		while(itLinkedList.hasNext()){
			
			System.out.println("Linked List Elements using Iterator :" +itLinkedList.next());
		}
		
	}

}
