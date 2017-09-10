package com.svk.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Company implements ApplicationContextAware{

	ApplicationContext context;
	
	Employee emp;
	
	String companyName;
	
	
	
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public ApplicationContext getContext() {
		return context;
	}

	public void setContext(ApplicationContext context) {
		this.context = context;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	public void initialized(){
		System.out.println("Bean is initialized");
	}

	@Override
	public void setApplicationContext(ApplicationContext cont)
			throws BeansException {
		this.context = cont;
		
	}
	
	public String getEmployeeName(String employeeBean){
		emp = (Employee)context.getBean(employeeBean);
		String employeeName = emp.getEmployeeName();
		return employeeName;
	}

}
