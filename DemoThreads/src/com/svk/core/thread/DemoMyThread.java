package com.svk.core.thread;

public class DemoMyThread {

	public static void main(String[] args) {
		
		
		MyThread myThread = new MyThread();
		
		System.out.println("Maximum Priority : "+myThread.MAX_PRIORITY);
		System.out.println("Minimum Priority : "+myThread.MIN_PRIORITY);
		System.out.println("Normal Priority : "+myThread.NORM_PRIORITY);
		
		
		myThread.setName("SVK Thread");
		
		myThread.start();
		
		
		
		

	}

}
