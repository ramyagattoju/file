package com.svk.bean.life;

import org.springframework.beans.factory.BeanNameAware;

public class SimpleAware implements BeanNameAware{

	String companyName;
	
	
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("Bean name :" +name);
		
		this.companyName = name;
		
	}

}
