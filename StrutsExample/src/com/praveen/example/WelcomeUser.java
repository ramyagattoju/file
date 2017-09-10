package com.praveen.example;

public class WelcomeUser{
	
	 
		private String username;
	 
		public String getUsername() {
			return username;
		}
	 
		public void setUsername(String username) {
			this.username = username;
		}
	 
		
		public String execute() {
				System.out.println("INSIDE EXECUTE --- Name :" +getUsername());
				
			return "SUCCESS";
	 
		}
	

}
