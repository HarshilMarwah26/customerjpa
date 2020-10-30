package org.cap.apps.customerms.repository;

import org.cap.apps.customerms.entities.*;

public interface ICustomerRepository {
	public Customer add(Customer customer);
	public Customer update(Customer customer);
	public Customer findById(Long id);
}
