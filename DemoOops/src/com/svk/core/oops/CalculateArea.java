package com.svk.core.oops;

public class CalculateArea {

	public static void main(String[] args){
		
		
		Shapes shapeObject = new Shapes(3.5, 4.5);
		
		double areaOfShape = shapeObject.area();
		
		System.out.println("Area of shapes :" +areaOfShape);
		
		
		Rectangle rectangleObject = new Rectangle(4.5,2.5);
		
		double areaOfRectangle = rectangleObject.area();
		
		System.out.println("Area of Rectangle :" +areaOfRectangle);
		
		
		Triangle triangleObject = new Triangle(2.5, 3.5);
		
		double areaOfTriangle = triangleObject.area();
		
		System.out.println("Area of Triangle is :" +areaOfTriangle);
		
		
	}
	
	
}
