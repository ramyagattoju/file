package com.demo.named.query;

import java.util.List;

import org.hibernate.Query;
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
		
		
		//SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		Session session = factory.openSession();
		
		Query query = session.getNamedQuery("findByName");
		query.setString("custName", "kumar");
		
		List<Customer> cust = query.list();
		
		for(Customer c :cust){
			
			System.out.println("Result : "+c.getCity() +"   " +c.getState());
		}
		
		session.close();//Detached state
		
		
	}

}
