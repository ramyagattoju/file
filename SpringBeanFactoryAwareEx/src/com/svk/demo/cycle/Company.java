package com.svk.demo.cycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class Company implements BeanFactoryAware{

	@Override
	public void setBeanFactory(BeanFactory fac) throws BeansException {
		
		System.out.println("setBeanFactory :" +fac);
	}
	
	public void initialized(){
		System.out.println("Bean is initialized");
	}

}
