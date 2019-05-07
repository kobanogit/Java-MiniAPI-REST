package com.example.MiniAPI.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MiniAPI.DAO.CustomerDAO;
import com.example.MiniAPI.service.CustomerService;
import com.example.MiniAPI.service.vo.Customer;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService{
	
	public static final Log log = LogFactory.getLog( CustomerServiceImpl.class );
	
	@Autowired private CustomerDAO customerDAO;

	public List<Customer> getCustomerList() {
		List<Customer> customers = customerDAO.findAll();
		
//		List<Customer> customers = new ArrayList<Customer>();
//		Customer customer1 = new Customer(1, "f1", "l1");
//		Customer customer2 = new Customer(2, "f2", "l2");
//		Customer customer3 = new Customer(3, "f3", "l3");
//		customers.add(customer1);
//		customers.add(customer2);
//		customers.add(customer3);
		
		return customers;
	}
	
}
