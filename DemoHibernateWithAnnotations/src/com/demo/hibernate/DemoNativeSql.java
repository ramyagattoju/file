package com.demo.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;



public class DemoNativeSql {
	
public static void main(String[] args) {
		
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().
		applySettings(configuration.getProperties());
		SessionFactory factory = configuration.buildSessionFactory(builder.build());
	
		// select * from CuStomEr where iD = 4;
		
		
		Session sess = factory.openSession();
		//SQLQuery query = sess.createSQLQuery("select *  from customer c where c.name = 'Peter'");
		
		Criteria crit = sess.createCriteria(Customer.class);
    	
    	crit.add(Restrictions.like("name", "kumar"));
    	
    	
    	List<Customer> employeeList =  crit.list();		
    	
    	
    	for(Customer em : employeeList) {
    		System.out.println("Resul t" +em.getCity());
    	}
		
		
		/*List<Object[]> cust = query.list(); 
	
		for(Object[] c:cust ){
			
			System.out.println("City Name :" +c[2].toString());
		}*/
	
		sess.close();
	
	}

}
