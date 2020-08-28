package com.clbee.pageserver.repository;

import com.clbee.pageserver.model.Customer;

import java.util.List;

public interface CustomerRepository {

	List<Customer> findAll();
	Customer findById(long id);
	Customer save(Customer customer);
}
