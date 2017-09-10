package com.svk.struts2;

import com.opensymphony.xwork2.ActionSupport;

public class WelcomePage extends ActionSupport  {
	
    private User user;
    
    
    
	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	@Override
	public void validate(){
		if(getUser().getFirstName().equals("")){
			addFieldError("user.firstName", "Please Enter the First Name");
			
		}
		
	}


	@Override
	public String execute(){
		
		System.out.println("Inside the execute method of Action class");
		
		if("praveen".equals(getUser().getFirstName())){
			return "SUCCESS";
		}
		return "FAILURE";
	}



	
	
	

}
