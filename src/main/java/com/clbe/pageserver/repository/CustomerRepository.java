package com.clbe.pageserver.repository;

import com.clbe.pageserver.Customer;

import java.util.List;

public interface CustomerRepository {

	List<Customer> findAll();
	Customer findById(long id);
	Customer save(Customer customer);
}
