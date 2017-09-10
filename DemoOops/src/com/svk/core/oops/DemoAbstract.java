package com.svk.core.oops;

public class DemoAbstract {

	public static void main(String[] args) {
		
		VehicleAbsImpl abs = new VehicleAbsImpl(); 
		
		abs.noOfSeats();
		abs.typeOfFuel();
		abs.noOfStreeings();
		
		System.out.println("No of seats :" +abs.noOfSeats());
		System.out.println("Type of Fuel :" +abs.typeOfFuel());
		System.out.println("Streering : " +abs.noOfStreeings());
		
      
		VehicleAbsComplImpl complImpl = new VehicleAbsComplImpl();
		
		System.out.println("Abs No of seats :" +complImpl.noOfSeats());
		System.out.println("Abs Type of Fuel :" +complImpl.typeOfFuel());
		
		VehicleInterfaceWithComplImpl complImpl2 = new VehicleInterfaceWithComplImpl();
		
		System.out.println("Abs No of seats :" +complImpl2.noOfSeats());
		System.out.println("Abs Type of Fuel :" +complImpl2.typeOfFuel());
		
		
			
		
		
		
	}

}
