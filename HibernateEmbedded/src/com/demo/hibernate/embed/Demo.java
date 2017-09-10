package com.demo.hibernate.embed;

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
		
		Address address = new Address();
		Employee emp = new Employee();
		
		emp.setName("john");
		emp.setSalary(6000);
		
		address.setCity("chicago");
		address.setState("Illinois");
		
		emp.setAddress(address);
		
		session.save(emp);
		
	
		session.getTransaction().commit();
		
		session.close();
		
		
	}

}
