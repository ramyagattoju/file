package com.svk.core.oops;

public class Shapes {
	
	public double dimension1;
	public double dimension2;
	
	public Shapes(double dim1,double dim2){		
		this.dimension1 = dim1;
		this.dimension2=dim2;
	}
	
	public double area(){
		
		System.out.println("Inside the area Method of Shapes class");
		
		double area = dimension1 *dimension2;
		
		return area;
		
	}

}
