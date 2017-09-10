package com.svk.core.thread;

public class MyThread extends Thread{
	
	
	
	public void run(){
		
		Thread thread = Thread.currentThread();
		
		System.out.println("Name of MyThread :" +thread.getName());

		for(int i = 0;i<10;i++){
			System.out.println("My Thread Program");
		}
	}

}
