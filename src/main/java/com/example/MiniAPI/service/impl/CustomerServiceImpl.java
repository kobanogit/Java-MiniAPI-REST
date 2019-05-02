package com.example.MiniAPI.service.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.MiniAPI.DAO.CustomerDAO;
import com.example.MiniAPI.service.CustomerService;
import com.example.MiniAPI.service.vo.Customer;

public class CustomerServiceImpl implements CustomerService{
	
	public static final Log log = LogFactory.getLog( CustomerServiceImpl.class );
	
	@Autowired 	private		CustomerDAO		customerDAO;

	public List<Customer> getCustomerList() {
		List<Customer> customers = customerDAO.findAll();
		return customers;
	}
	
}
