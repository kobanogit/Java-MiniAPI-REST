package com.example.MiniAPI.controller;

import java.util.ArrayList;
import java.util.List;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.MiniAPI.controller.ssx.CustomerSSX;
import com.example.MiniAPI.service.CustomerService;
import com.example.MiniAPI.service.vo.Customer;


@RestController("MiniAPICustomerController")
@RequestMapping("/customer")
public class CustomerController {

	@Autowired private Mapper mapper;
	
	@Autowired private CustomerService customerService;
	
    @GetMapping("/")
    public String handler() {
       return "customer request received !";
    }
	
	@GetMapping("/find_all/")
	public List<CustomerSSX> getCustomers() {
		List<Customer> customersVO = customerService.getCustomerList();
		List<CustomerSSX> customersSSX = new ArrayList<CustomerSSX>();
		for ( Customer customer : customersVO ) {
			customersSSX.add( (CustomerSSX) mapper.map(customer, CustomerSSX.class) );
		}
		
//		CustomerSSX customerSSX = new CustomerSSX(3, "Steve", "Macqueen");
//		customersSSX.add(customerSSX);
		
		// First test without DB
//		for ( Customer customerVO : customersVO ) {
//			customersSSX.add( (CustomerSSX) mapper.map(customerVO, CustomerSSX.class ) );
//		}
		return customersSSX;
	}
	
}
