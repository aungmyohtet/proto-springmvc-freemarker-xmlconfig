package com.amh.springmvc.sample.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.amh.springmvc.sample.models.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {
	
private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	@Override
	public void add(Customer customer) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(customer);
	}

	@Override
	public List<Customer> getAll() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Customer> customers = session.createQuery("from Customer").list();
		return customers;
	}

	@Override
	public void update(Customer customer) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(customer);
	}

	@Override
	public void delete(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Customer customer = (Customer) session.load(Customer.class, new Integer(id));
		if(customer != null){
			session.delete(customer);
		}
	}

	@Override
	public Customer findById(int id) {
		Session session = this.sessionFactory.getCurrentSession();		
		Customer customer = (Customer) session.load(Customer.class, new Integer(id));
		return customer;
	}

}
