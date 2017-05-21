package com.amh.springmvc.sample.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.amh.springmvc.sample.dao.CustomerDao;
import com.amh.springmvc.sample.models.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	private CustomerDao customerDao;

	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}
	
	@Override
	@Transactional
	public void add(Customer customer) {
		this.customerDao.add(customer);
	}

	@Override
	public List<Customer> getAll() {
		return this.customerDao.getAll();
	}

	@Override
	@Transactional
	public void update(Customer customer) {
		this.customerDao.update(customer);
	}

	@Override
	@Transactional
	public void delete(int id) {
		this.customerDao.delete(id);
	}

	@Override
	public Customer findById(int id) {
		return this.customerDao.findById(id);
	}

}
