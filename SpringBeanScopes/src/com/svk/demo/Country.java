package com.svk.demo;

public class Country {
	
	private String countryName;
	
	public void putContryName(String name){
		this.countryName = name;
	}
	
	public void printCountryName(){
		System.out.println("Your Country Name :" +countryName);
	}
	
}
