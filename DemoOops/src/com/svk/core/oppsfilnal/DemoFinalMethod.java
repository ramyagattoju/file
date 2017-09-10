package com.svk.core.oppsfilnal;

public class DemoFinalMethod {

	public static void main(String[] args) {
		
		City city = new City();
		
		String cityName = city.getName();
		
		
		
		System.out.println("Name of city is :" +cityName);
		
		System.out.println("City zip is : " +city.getZipCode());
		
		Town town = new Town();
		
		System.out.println("Name of town is :" +town.getName());
	}

}
