package com.svk.core.thread;

public class Account {
	
	private int balance = 5000;
	
	public int getBalance(){
		return balance;
	}
	
	public void withDraw(int amount){
		balance = balance - amount;
	}

}
