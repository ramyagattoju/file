package com.svk.struts;

public class HelloUser {
	
	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public String execute(){
		
		return "SUCCESS";
	}

}
