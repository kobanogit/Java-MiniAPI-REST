package com.example.MiniAPI.DAO.impl;

import java.util.Collection;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.DetachedCriteria;

import com.example.MiniAPI.DAO.CustomerDAO;
import com.example.MiniAPI.service.vo.Customer;
import com.example.MiniAPI.util.HibernateUtil;

public class CustomerDAOImpl implements CustomerDAO {

	@Override
	public void cleanSession() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Session getSession() {

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
		
		return null;
	}

	@Override
	public List<Customer> findAll() {
		return getSession().createQuery("from Customer", Customer.class).list();
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
