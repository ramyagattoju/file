package com.svk.core.oops;

public class Car implements Vehicle{
	
	@Override
	public int noOfSeats() {
		int noOfSeats = 4;
		return noOfSeats;
	}
	
	@Override
	public String typeOfFuel() {
		String fuelType = "Petrol";
		
		return fuelType;
	}
	
	public int noOfPeople(){
		int people = 5;
		return people;
	}

}
