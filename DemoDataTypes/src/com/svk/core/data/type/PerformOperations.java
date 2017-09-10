package com.svk.core.data.type;

public class PerformOperations {

	public static void main(String[] args) {
		
		int a = 23;
		int b = 22;
		
		
		boolean booleanVal = true;
		
		
	// ArithMetic Operators	
		int additionValue = a+b;
		int subValue = a-b;
		int mulVal = a*b;
		double divVal  = a/b;
		double modVal = a%b;
		
		
		System.out.println("Addition :" +additionValue);
		System.out.println("subValue :" +subValue);
		System.out.println("mulVal :" +mulVal);
		System.out.println("divVal :" +divVal);
		System.out.println("modVal :" +modVal);
		
		// Unary Operators 
		
		System.out.println("Plus operator : " +(+a));
		System.out.println("Plus operator : " +(-a));
		System.out.println("Plus operator : " +(++a));
		// a = 1 +a ;
		System.out.println("Plus operator : " +(--a));
		// a= a-1;
		System.out.println("Plus operator : " +(!booleanVal));
		
	}

}
