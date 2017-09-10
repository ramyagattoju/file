package com.svk.core.oops;

import com.svk.core.oops.Address;


public class StudentRecord {
	

	public static void main(String[] args){
		
		
		Address addressObject = new Address();
		
		
		addressObject.setCity("chicago");
		addressObject.setState("Illinois");
		
				
		System.out.println("City is :" +addressObject.getCity());
		System.out.println("State is :" +addressObject.getState());
		
	}

}
