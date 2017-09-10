package com.demo.hibernate.one2many;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Demo {

	public static void main(String[] args) {
		
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().
		applySettings(configuration.getProperties());
		SessionFactory factory = configuration.buildSessionFactory(builder.build());
		
		Session session = factory.openSession();
		
		session.beginTransaction();
		
		Department department = new Department();
		department.setDepartmentName("ACCOUNTS");
		
		Employee emp1 = new Employee();
		emp1.setName("John");
		emp1.setSalary(6000);
		
		Employee emp2 = new Employee();
		emp2.setName("Regina");
		emp2.setSalary(7000);
		
		department.setEmployees(new ArrayList<Employee>());
		department.getEmployees().add(emp1);
		department.getEmployees().add(emp2);
		
		session.save(department);
		
	
		session.getTransaction().commit();
		
		session.close();
		
	}

}
