package org.cap.apps.customerms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;

import org.cap.apps.customerms.entities.*;
import org.cap.apps.customerms.repository.*;

@Service
public class CustomerServiceImpl implements ICustomerService{

	@Autowired
	private ICustomerRepository repository;
	
	@Override
	@Transactional
	public Customer register(Customer customer) {
		customer = repository.add(customer);
		return customer;
	}
	

	@Override
	@Transactional
	public Customer updateName(Long id, String name) {
		Customer customer = repository.findById(id);
		customer.setName(name);
		customer = repository.update(customer);
		return customer;
	}

}
