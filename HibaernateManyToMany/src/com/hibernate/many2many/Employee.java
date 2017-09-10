package com.hibernate.many2many;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes.Name;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


@Entity
public class Employee {
	

	@Id
	@GeneratedValue
	@Column(name = "employee_id")
	private int employeeId;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "SALARY")
	private int salary;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "EMPLOYEE_PROJECT",
			   joinColumns ={@JoinColumn(name="EMPLOYEE_ID")},
			   inverseJoinColumns={@JoinColumn(name = "PROJECT_ID")})
	private List<Project> projects = new ArrayList<Project>();

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	
	

}
