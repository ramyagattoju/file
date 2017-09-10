package com.svk.core.oops;

public class MotorCycle implements Vehicle,Brand{
	
	@Override
	public String brandName() {
		
		return "honda";
	}
	
	@Override
	public int noOfSeats() {
		
		return 2;
	} 
	
	@Override
	public String typeOfFuel() {
		
		return "petrol";
	}

}
