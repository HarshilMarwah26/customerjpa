package org.cap.apps.customerms.service;

import org.cap.apps.customerms.entities.*;

public interface ICustomerService {
	public Customer register(Customer customer);
	public Customer updateName(Long id, String name);
}
