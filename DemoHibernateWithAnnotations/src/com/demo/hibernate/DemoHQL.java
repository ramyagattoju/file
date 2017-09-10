package com.demo.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class DemoHQL {
	
	public static void main(String[] args) {
		
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().
		applySettings(configuration.getProperties());
		SessionFactory factory = configuration.buildSessionFactory(builder.build());
	
		// select * from CuStomEr where iD = 4;
		
		
		Session sess = factory.openSession();
		Query query = sess.createQuery(" from Customer c where c.name = 'Peter'");
					
		
		
		List<Customer> cust = query.list(); 
	
		for(Customer c:cust ){
			
			System.out.println("City Name :" +c.getCity());
		}
	
		sess.close();
	
	}

}
