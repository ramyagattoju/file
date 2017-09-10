package com.svk.core.exp.handling;

public class DemoExpHandling {
	
	public static void main(String[] comments){
		
		try{
			int a = 10;
			int b = 0;
		
			double result = a/b;
		
			System.out.println("Result is :" +result);
		}
		catch(NullPointerException npe){
			System.out.println("Inside Null pointer exception :" +npe.getMessage());
		}
		
		catch(ArithmeticException ae){
			System.out.println("Its an Arithmetic exception :" +ae.getMessage());
		}
		catch(Exception exceptionInDemo){
			System.out.println("I'm in catch exception block");
			System.out.println(" Error is :" +exceptionInDemo.getMessage());
			
		}
		
	}

}
