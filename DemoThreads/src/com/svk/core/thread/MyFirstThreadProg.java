package com.svk.core.thread;

public class MyFirstThreadProg {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		Thread firstThread = Thread.currentThread();
		
		System.out.println("My Current Thread Name is :" +firstThread.getName());
		
		System.out.println("Before Sleeping");
		
		firstThread.sleep(4000);
		
		System.out.println("After Waking up");
	}

}
