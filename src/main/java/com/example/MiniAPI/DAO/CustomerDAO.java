package com.example.MiniAPI.DAO;

import java.util.List;

import com.example.MiniAPI.service.vo.Customer;

public interface CustomerDAO extends GenericDAO<Customer, Long> {
	
	List<Customer> findAll();
	
}
