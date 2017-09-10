package com.svk.core.oops;

public class DemoInterface {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		int seats = car.noOfSeats();
		String fuel = car.typeOfFuel();
		int people = car.noOfPeople();
		
		System.out.println("For Car Seats # :" +seats);
		System.out.println("For Car Fuel is :" +fuel);	
		System.out.println("For Car People # :" +people);
		
		
		Bus bus = new Bus();
		
		int busSeat = bus.noOfSeats();
		String busFuel = bus.typeOfFuel();
		
		System.out.println("For Bus Seats # :" +busSeat);
		System.out.println("For Bus Fuel is :" +busFuel);
		
		Vehicle vehicle = new Car();
		
		vehicle.noOfSeats();
		vehicle.typeOfFuel();
	//	vehicle.noOfPeople(); --This is not possible , we cannot access method which is only confined to a implementation class.
		
		System.out.println("For Vehicle Seats # :" +vehicle.noOfSeats());
		System.out.println("For Vehicle Fuel is :" +vehicle.typeOfFuel());	
		
		
		MotorCycle cycle = new MotorCycle();
		
		System.out.println("For Motor Cycle Seats # " +cycle.noOfSeats());
		System.out.println("For Motor Cycle Fuel is " +cycle.typeOfFuel());
		System.out.println("For Motor Cycle Brand is " +cycle.brandName());
		
		Vehicle vehicleMotor = new MotorCycle();
		
		vehicleMotor.noOfSeats();
		vehicleMotor.typeOfFuel();
		
		System.out.println("For Vehicle Seats # " +vehicleMotor.noOfSeats());
		System.out.println("For Vehicle Fuel is " +vehicleMotor.typeOfFuel());
		
		
		FlightImplementation impl = new FlightImplementation();
		
		System.out.println("For Flight Cycle Seats # " +impl.noOfSeats());
		System.out.println("For Flight Cycle Fuel is " +impl.typeOfFuel());
		System.out.println("For Flight Cycle Brand is " +impl.noOfDrivers());
		
		
	}	

}
