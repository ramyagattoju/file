package com.svk.core.exp.handling;

public class HandleGuests {

	public static void main(String[] args) {
		
		
		
		Feed objectFeed = new Feed();
		
		try {
			
			objectFeed.feedGuests(10);
			
			
		}catch (FoodException e) {
			
			System.out.println("My Food program from Food Excpetion : " +e.getMessage());
		} 
		
		catch (Exception e) {
			
			System.out.println("My Food program : " +e.getMessage());
		}
		
		finally{
			System.out.println("Accept gift even if he/she had food or not");
		}

	}

}
