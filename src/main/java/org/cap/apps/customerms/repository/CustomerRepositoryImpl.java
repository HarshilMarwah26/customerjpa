package org.cap.apps.customerms.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import org.cap.apps.customerms.entities.*;

@Repository

//@Component
public class CustomerRepositoryImpl implements ICustomerRepository {


	@PersistenceContext
	private EntityManager entitymanager;

	
	@Override
	public Customer add(Customer customer) {
		entitymanager.persist(customer);
		return customer;
	}

	@Override
	public Customer update(Customer customer) {
		return entitymanager.merge(customer);
	}
	
	@Override
	public Customer findById(Long id) {
		return entitymanager.find(Customer.class, id);
	}

}
