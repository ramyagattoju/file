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
		
		Customer cs = new Customer();//Transient State
		
		
		cs.setName("pankaj");
		cs.setCity("ofallon");
		cs.setState("Missouri");
		
		Customer cs2 = new Customer();//Transient State
		
		
		cs2.setName("Ron");
		cs2.setCity("chicago");
		cs2.setState("Illinois");

		Customer cs3 = new Customer();//Transient State
		
		
		cs3.setName("Jim");
		cs3.setCity("chicago");
		cs3.setState("Illinois");
		
Customer cs4 = new Customer();//Transient State
		
		
cs4.setName("Peter");
cs4.setCity("chicago");
cs4.setState("Illinois");
		
Customer cs5 = new Customer();//Transient State
		
		
cs5.setName("shaan");
cs5.setCity("chicago");
cs5.setState("Illinois");
		
Customer cs6 = new Customer();//Transient State
		
		
cs6.setName("lei");
cs6.setCity("chicago");
cs6.setState("Illinois");
		
		session.save(cs);//persistent state
		session.save(cs2);
		session.save(cs3);
		session.save(cs4);
		session.save(cs5);
		session.save(cs6);
		
		cs2.setName("kumar");
		
		session.getTransaction().commit();
		
		session.close();//Detached state
		
		
	}

}
