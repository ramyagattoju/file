package com.svk.core.data.type;

public class DemoSwitchCase {

	String name ;
	int age;
	
	
	
	public DemoSwitchCase(String name, int age) {
	
		this.name = name;
		this.age = age;
	}



	public static void main(String[] args) {
		

DemoSwitchCase cased = new DemoSwitchCase("hari", 12);

System.out.println("cased " +cased.name);

	}
}
