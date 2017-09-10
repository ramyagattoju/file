package com.svk.core.oops;

public class Bus implements Vehicle{
	
	@Override
	public int noOfSeats(){
		int noOfSeats = 50;
		return noOfSeats;
	}
	
	@Override
	public String typeOfFuel(){
		String fuel = "diesel";
		return fuel;
	}

}
