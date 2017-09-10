package com.svk.service;

import java.util.ArrayList;
import java.util.List;

import com.svk.employee.Employee;

public class EmployeeService {
	
	public List<Employee> getEmployeeDetails(){
		
		
		List<Employee> empList = new ArrayList<Employee>();
		
		Employee emp1 = new Employee();
		
		emp1.setEmpId(123);
		emp1.setEmpName("bob");
		
		Employee emp2 = new Employee();
		
		emp2.setEmpId(456);
		emp2.setEmpName("david");
		
		Employee emp3 = new Employee();
		
		emp3.setEmpId(789);
		emp3.setEmpName("tim");
		
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		
		
		return empList;
		
	}

}
