package com.svk.core.thread;

public class AccountAccess implements Runnable{

	private Account account = new Account();
	
	private synchronized void makeWithDrawal(int amount){
		
		if(account.getBalance() >= amount){
			
			System.out.println(Thread.currentThread().getName() +" is going to withdraw");
		
		try{
			Thread.sleep(1000);
		}catch(Exception e){
			
		}
		
		account.withDraw(amount);
		System.out.println(Thread.currentThread().getName() +" compltes the withdrawal");
		
		
	}else{
		System.out.println("Not enough balance in account for " +Thread.currentThread().getName() + " to withdraw " +account.getBalance());
		}
	}
	
	
	@Override
	public void run() {
		
		for(int i = 0;i<5;i++){
			
			makeWithDrawal(1000);
			if(account.getBalance() < 0){
				System.out.println("Account is overdrawn");
			}
		}
		
		
	}

}
