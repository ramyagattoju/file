package com.svk.core.thread;

public class RunnableImpl implements Runnable{

	@Override
	public void run() {
		
		for(int i = 0; i< 10 ;i++){
			System.out.println(Thread.currentThread().getName()+ "   :  " +i);
		}
		
		
	}
	
	public static void main(String[] thr) throws InterruptedException{
		
			Thread thread1 = new Thread(new RunnableImpl(),"SVK Thread 1");
			Thread thread2 = new Thread(new RunnableImpl(), "SVK Thread 2");
			
			
			
		
			thread1.join();
			
			thread1.start();
			thread2.start();
			
		//	thread1.yield();
			
		
	}
	
}


