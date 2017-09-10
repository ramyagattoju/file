package com.hibernate.many2many;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	
	@Id
	@GeneratedValue
	@Column(name = "PROJECT_ID")
	private int projectId;
	
	@Column(name = "PROJECT_NAME")
	private String prjectName;
	
	@Column(name= "START_DATE")
	private Date startDate;
	
	@ManyToMany(mappedBy="projects")
	private List<Employee> employees = new ArrayList<Employee>();

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getPrjectName() {
		return prjectName;
	}

	public void setPrjectName(String prjectName) {
		this.prjectName = prjectName;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	
}
