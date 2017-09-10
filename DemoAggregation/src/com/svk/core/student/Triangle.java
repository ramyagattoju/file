package com.svk.core.student;

public class Triangle extends Shapes{
	
	Triangle(double a,double b){
		super(a,b);
	}
	
	@Override
	public double area(){
		return dim1*dim2/2;
	}

}
