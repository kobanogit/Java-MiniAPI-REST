package com.example.MiniAPI.service.vo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="order")
public class Order {

	@Id
	@Column(name = "id", updatable = false, nullable = false)
	private Integer id;
	
	@Column(name = "customer_id")
	private Integer customerId;
	
	@Column(name = "reference")
	private String reference;
	
	@Column(name = "price")
	private Double price;
	
	@Column(name = "date")
	private Date date;
	
}
