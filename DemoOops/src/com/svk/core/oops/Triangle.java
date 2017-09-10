package com.svk.core.oops;

//inheritance
public class Triangle extends Shapes{

	public Triangle(double dim1, double dim2) {
		super(dim1, dim2);//constructor chaining
		
	}
	
	//polymorphism
	
	//Method Overriding
	@Override
	public double area(){
		System.out.println("Inside area method of Triangle class");
		double areaofTriangle = (dimension1*dimension2)/2;
		return areaofTriangle;
	}

}
