package com.hibernate.single.table;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Demo {
	//Single Table
	public static void main(String[] args) {
		
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().
		applySettings(configuration.getProperties());
		SessionFactory factory = configuration.buildSessionFactory(builder.build());
		
		Session session = factory.openSession();
		
		session.beginTransaction();
		

        
		Student student1 = new Student();
		student1.setName("paula");
		student1.setInstructor("john");
		student1.setStandard("5");
		

		Student student2 = new Student();
		student2.setName("keith");
		student2.setInstructor("tim");
		student2.setStandard("6");
		
		Teacher techer1 = new Teacher();
		techer1.setName("steve");
		techer1.setSalary(4000);
		techer1.setSubject("JAVA");
		
		Teacher techer2 = new Teacher();
		techer2.setName("chris");
		techer2.setSalary(5000);
		techer2.setSubject("JAVASCRIPT");
		
		Person p = new Person();
		p.setName("victor");
		
		session.save(p);
		session.save(student1);
		session.save(student2);
		session.save(techer1);
		session.save(techer2);
		
		session.getTransaction().commit();
		
		session.close();
		
		
	}

}
