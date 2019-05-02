package com.example.MiniAPI.DAO.impl;

import java.util.Collection;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;

import com.example.MiniAPI.DAO.CustomerDAO;
import com.example.MiniAPI.service.vo.Customer;

public class CustomerDAOImpl implements CustomerDAO {

	@Override
	public void cleanSession() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Session getSession() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Session getSession(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SessionFactory getTenantSessionFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		return null;
	}





}
