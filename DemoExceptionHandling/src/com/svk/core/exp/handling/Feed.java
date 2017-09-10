package com.svk.core.exp.handling;

public class Feed {

	public  void feedGuests(int noOfGuests) throws Exception{
		
		
		for(int i = 1; i < noOfGuests ; i++){
			
			if( i == 6){
				throw new FoodException(" No Food ");
			}else {
				System.out.println("Food is Sufficient ____ Go ENjoy !!!!");
			}
			
		}
		
	
	}
	
}
