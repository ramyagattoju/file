package com.hibernate.many2many;

import java.util.ArrayList;
import java.util.Date;

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
		
		Employee emp1 = new Employee();
		emp1.setName("peter");
		emp1.setSalary(3000);
		
		Employee emp2 = new Employee();
		emp2.setName("john");
		emp2.setSalary(6000);
		
		Project prj1 = new Project();
		prj1.setPrjectName("PROJECT_ONE");
		prj1.setStartDate(new Date());
		
		Project prj2 = new Project();
		prj2.setPrjectName("PROJECT_TWO");
		prj2.setStartDate(new Date());
		
		
		emp1.getProjects().add(prj1);
		emp2.getProjects().add(prj2);
		emp2.getProjects().add(prj1);
		
		session.save(emp1);
		session.save(emp2);
		
	
		session.getTransaction().commit();
		
		session.close();
		
		
	}

}
