package com.demo.hibernate.one2one;

import java.util.List;

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
		
		address.setCity("atlanta");
		address.setState("Georgia");
		
		Employee empl = new Employee();
		
		empl.setName("Peter");
		empl.setSalary(6000);
		
		empl.setAddress(address);
        address.setEmployee(empl);	
        
        session.save(empl);
        
        List<Employee> employeeList =  session.createQuery("from  Employee").list();
        for(Employee em :employeeList){
        	
        	System.out.println("Record :   " +em.getName() +" ****** "+"City :" +em.getAddress().getCity());
        }
	
		session.getTransaction().commit();
		
		session.close();
		
		
	}

}
