package com.amh.springmvc.sample.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.amh.springmvc.sample.models.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void add(Customer customer) {	
		entityManager.persist(customer);
	}

	@Override
	public List<Customer> getAll() {
		return entityManager.createQuery("SELECT c FROM Customer c", Customer.class).getResultList();
	}

	@Override
	public void update(Customer customer) {
		entityManager.merge(customer);
	}

	@Override
	public void delete(int id) {
		Customer customer = entityManager.find(Customer.class, id);
		if(customer != null){
			entityManager.remove(customer);
		}
	}

	@Override
	public Customer findById(int id) {
		return entityManager.find(Customer.class, id);
	}

}
