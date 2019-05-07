package com.example.MiniAPI.service.vo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="table_order")
public class OrderVO {


	@Id
	@Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "customer_id")
	private Integer customerId;
	
	@Column(name = "reference")
	private String reference;
	
	@Column(name = "price")
	private Double price;
	
	@Column(name = "date")
	private Integer date;
	
	
	public OrderVO() {
		super();
	}
	
	public OrderVO(Integer id, Integer customerId, String reference, Double price, Integer date) {
		super();
		this.id = id;
		this.customerId = customerId;
		this.reference = reference;
		this.price = price;
		this.date = date;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getDate() {
		return date;
	}

	public void setDate(Integer date) {
		this.date = date;
	}
	
	
	
}
