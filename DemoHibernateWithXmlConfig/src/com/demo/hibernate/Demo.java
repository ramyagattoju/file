package com.demo.hibernate;

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
		
		session.beginTransaction();
		
		Customer cs = new Customer();
		
		cs.setId(8);
		cs.setName("kim");
		cs.setCity("atlanta");
		cs.setState("georgia");
		
		session.update(cs);
		
		session.getTransaction().commit();
		
		session.close();
		
		
	}

}
