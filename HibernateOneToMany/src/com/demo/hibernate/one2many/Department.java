package com.demo.hibernate.one2many;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Department {
	
	@Id
	@GeneratedValue
	@Column(name = "DEPARTMENT_ID")
	private int departmentId;
	
	@Column(name = "DEPT_NAME")
	private String departmentName;
	
	@OneToMany(cascade =CascadeType.ALL)
	@JoinColumn(name = "department_id")
	private List<Employee> employees;
	
	
	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	
	
}
