package com.example.MiniAPI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.MiniAPI.service.vo.Customer;

public interface OrderService {

	public List<Customer> getCustomerList ();
	
}
