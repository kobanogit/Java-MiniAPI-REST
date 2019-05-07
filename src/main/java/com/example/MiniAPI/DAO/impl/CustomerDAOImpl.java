package com.example.MiniAPI.DAO.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.example.MiniAPI.DAO.CustomerDAO;
import com.example.MiniAPI.service.vo.Customer;
import com.example.MiniAPI.util.HibernateUtil;

@Repository( "CustomerDAO" )
public class CustomerDAOImpl implements CustomerDAO {

	public static final Log  log = LogFactory.getLog( CustomerDAOImpl.class );
	
	Customer cust1 = new Customer(1, "john", "Loop1");
	Customer cust2 = new Customer(2, "jack", "Pool2");
	
	@Override
	public void cleanSession() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Session getSession() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session;
        } catch (Exception e) {
        	log.error( "getSession error : ", e );
        }
		return null;
	}

	@Override
	public List<Customer> findAll() {
		
		Transaction transaction = null;
        /*try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(cust1);
            session.save(cust2);
            transaction.commit();
            
            
        } catch (Exception e) {
        	e.printStackTrace();
        	
            if (transaction != null)
                transaction.rollback();

            e.printStackTrace();
        }*/
        
        List<Customer> customers = new ArrayList<Customer>();
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            customers = session.createQuery("from Customer", Customer.class).list();
            customers.forEach(c -> System.out.println(c.getFirstName()));
//            customers.forEach(c -> log.error( c.getFirstName() ));
            
        } catch (Exception e) {
        	e.printStackTrace();
        	
            if (transaction != null)
                transaction.rollback();

            e.printStackTrace();
        }
        
        return customers;
		
//		Session session = getSession();
//		
//		Transaction transaction = session.beginTransaction();
//		session.save(cust1);
//        session.save(cust2);
//        transaction.commit();
//        
//		return getSession().createQuery("from Customer", Customer.class).list();
		
		
		
//		List<Customer> customers = new ArrayList<Customer>();
//		return customers;
	}


	@Override
	public void addList ( List<Customer> customers ) {
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		for ( Customer customer : customers ) {
			session.save ( customer );
			transaction.commit();
		}
	}


}
