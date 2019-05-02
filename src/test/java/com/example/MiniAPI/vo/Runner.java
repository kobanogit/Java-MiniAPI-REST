package com.example.MiniAPI.vo;


import org.hibernate.query.Query;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import com.example.MiniAPI.service.vo.Customer;

public class Runner {

	@Test
	public void crud() {
//		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		/*SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        
        create(session);
        read(session);
        
        update(session);
        read(session);
        
        delete(session);
        read(session);
        
        session.close();*/
	}
	
	/*private void delete(Session session) {
        System.out.println("Deleting mondeo record...");
        Customer mondeo = (Customer) session.get(Customer.class, "mondeo");
         
        session.beginTransaction();
        session.delete(mondeo);
        session.getTransaction().commit();
    }
	
	private void update(Session session) {
        System.out.println("Updating mustang price...");
        Customer mustang = (Customer) session.get(Customer.class, "mustang");
        mustang.setFirstName("mustang");
        mustang.setLastName("£35,250.00");
         
        session.beginTransaction();
        session.saveOrUpdate(mustang);
        session.getTransaction().commit();
    }
 
    private void create(Session session) {
        System.out.println("Creating Customer records...");
        Customer mustang = new Customer();
        mustang.setFirstName("mustang");
        mustang.setLastName("£40,000.00");
         
        Customer mondeo = new Customer();
        mondeo.setFirstName("mondeo");
        mondeo.setLastName("£20,000.00");
         
        session.beginTransaction();
        session.save(mustang);
        session.save(mondeo);
        session.getTransaction().commit();
    }
     
    private void read(Session session) {
        Query q = session.createQuery("select _Customer from Customer _Customer");
         
        List<Customer> Customers = q.list();
         
        System.out.println("Reading Customer records...");
        System.out.printf("%-30.30s  %-30.30s%n", "Model", "Price");
        for (Customer c : Customers) {
            System.out.printf("%-30.30s  %-30.30s%n", c.getFirstName(), c.getLastName());
        }
    }*/
	
}
