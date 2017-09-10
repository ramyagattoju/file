package com.svk.core.thread;

public class DemoInnerClass {

	public static void main(String[] args) {
		
	OuterClass out = new OuterClass();
	
	OuterClass.InnerClass inner = out.new InnerClass();

	OuterClass.InnerClass innerClass = new OuterClass().new InnerClass();
	
	innerClass.getMyName();
	
	
	
	
	}

}
