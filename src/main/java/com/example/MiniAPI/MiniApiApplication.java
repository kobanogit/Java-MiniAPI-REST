package com.example.MiniAPI;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.Transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.MiniAPI.service.CustomerService;
import com.example.MiniAPI.service.impl.CustomerServiceImpl;
import com.example.MiniAPI.service.vo.Customer;
import com.example.MiniAPI.util.HibernateUtil;

@SpringBootApplication
public class MiniApiApplication {

	@Autowired private CustomerService customerService;
	
	
	public static void main(String[] args) {
		
		Customer cust1 = new Customer(1, "john", "Loop1");
		Customer cust2 = new Customer(2, "jack", "Pool2");
		
		
		Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(cust1);
            session.save(cust2);
            transaction.commit();
            
            
        } catch (Exception e) {
        	e.printStackTrace();
        	
            if (transaction != null)
                transaction.rollback();

            e.printStackTrace();
        }
        
        
        CustomerService customerService = new CustomerService();
        
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            List<Customer> customers = session.createQuery("from Customer", Customer.class).list();
            customers.forEach(c -> System.out.println(c.getFirstName()));
            
        } catch (Exception e) {
        	e.printStackTrace();
        	
            if (transaction != null)
                transaction.rollback();

            e.printStackTrace();
        }
        
//		CustomerService cust = new CustomerServiceImpl(); 
//		List<Customer> customers = cust.getCustomerList();
//		
//		System.out.println(customers);

		
		
		//		List<String> list = Arrays.asList("aa", "bb", "cc"); 
//		
//		// more readable
//		list.replaceAll(a -> a.toUpperCase());
//		list.forEach(b -> System.out.println(b));
//		
//		// could be substituted by:
//		list.replaceAll(String::toUpperCase);
//		list.forEach(System.out::println);
//		
//		String varA = "123";
//		String varB = null;
//		
//		Boolean AExist = ( varA!= null && !varA.isEmpty() );
//		Boolean BExist = ( varB!= null && !varB.isEmpty() );
//		System.out.println("varA not null : " + AExist + " varB not null : " + BExist);
		
	}
	
}
