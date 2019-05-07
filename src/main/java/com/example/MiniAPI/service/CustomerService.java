package com.example.MiniAPI.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.MiniAPI.service.vo.Customer;

@Service("apiCustomerService")
public interface CustomerService {

	List<Customer> getCustomerList();

}
