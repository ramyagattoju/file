package com.hibernate.single.table;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value= "SVK_STUDENT")
public class Student extends Person{
	
	@Column(name = "STANDARD")
	private String standard;
	
	@Column(name = "INSTRUCTOR")
	private String instructor;

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	
	
}
