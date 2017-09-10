package com.svk.bean.life.cycle;

public class Country {
	
	private String countryName;
	
	public void putContryName(String name){
		this.countryName = name;
	}
	
	public void printCountryName(){
		System.out.println("Your Country Name :" +countryName);
	}
	
	public void myInit(){
		System.out.println("I'm inside INIT method");
	}
	
	public void destroy(){
		System.out.println("I'm inside Destroy method");
	}
}
