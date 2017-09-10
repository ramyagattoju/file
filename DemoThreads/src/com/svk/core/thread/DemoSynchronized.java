package com.svk.core.thread;

public class DemoSynchronized {
	
	public static void main(String[] args){
		
		AccountAccess access = new AccountAccess();
		
		Thread thread1 = new Thread(access,"Harry");
		
		Thread thread2 = new Thread(access,"Smith");
		
		thread1.start();
		thread2.start();
	}

}
