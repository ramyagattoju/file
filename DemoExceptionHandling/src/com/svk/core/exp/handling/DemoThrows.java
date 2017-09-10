package com.svk.core.exp.handling;

public class DemoThrows {
	
	public static void main(String[] args){
		
		try{
			int a = 10;
			int b = 0;
			
			int result = a/b;
			
			System.out.println("This line never gets printed");
		}catch(Exception ex){
			System.out.println("An Fatal Exception occured :" +ex.getMessage());
		}
		finally{
			System.out.println("This will get printed irrespctive of failure of the program");
		}
		
	}

}
