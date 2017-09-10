package com.svk.core.student;

public class Shapes {
	double dim1;
	double dim2;
	
	public Shapes(double dim1, double dim2) {
	
		this.dim1 = dim1;
		this.dim2 = dim2;
	}
	
	public double area(){
		return dim1*dim2;
	}
}
