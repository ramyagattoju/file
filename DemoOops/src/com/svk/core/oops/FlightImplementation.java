package com.svk.core.oops;

public class FlightImplementation implements Flight{
	
	@Override
	public int noOfDrivers() {
		
		return 2;
	}
	@Override
	public int noOfSeats() {
		
		return 200;
	} 
	@Override
	public String typeOfFuel() {
		
		return "Petrol";
	}

}
