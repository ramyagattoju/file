package com.hibernate.single.table;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value= "SVK_TEACHER")
public class Teacher extends Person{
	
	@Column(name = "SUBJECT")
	private String subject;
	
	@Column(name = "SALARY")
	private int salary;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	

}
