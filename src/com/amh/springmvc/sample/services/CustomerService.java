package com.amh.springmvc.sample.services;

import java.util.List;

import com.amh.springmvc.sample.models.Customer;

public interface CustomerService {

void add(Customer customer);
	
	List<Customer> getAll();
	
	void update(Customer customer);
	
	void delete(int id);
	
	Customer findById(int id);
}
