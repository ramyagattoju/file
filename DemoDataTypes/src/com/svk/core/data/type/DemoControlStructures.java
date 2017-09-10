package com.svk.core.data.type;

public class DemoControlStructures {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		if(a==b){
			System.out.println(" A is equal to B");
		} 
		else if(a != b){
			System.out.println("A is not Equal to B");
			
		} 
		//once a successful condition is satisfied rest of the blocks are not executed 
		 else if  (a > b){
			System.out.println("A is greater B");
		}
		 else if (a >= b){
			System.out.println("A is greater than or Equal to B");
		}
		 else if (a < b){
			System.out.println("A is less to B");
		}
		 else if (a <= b){
			System.out.println("A is less than or Equal to B");
		}
			 
	}

}
