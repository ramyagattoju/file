package com.svk.core.student;

public class Area {

	public static void main(String[] args) {
		
		Rectangle rec= new Rectangle(2, 3);
		
		double area = rec.area();
		System.out.println("Area is " +area);
		
		
		Triangle tr = new Triangle(2, 6);
		
		double areaOfTr = tr.area();
		
		System.out.println("Tr is" +areaOfTr);

	}

}
