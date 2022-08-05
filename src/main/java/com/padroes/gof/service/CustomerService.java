package com.padroes.gof.service;

import com.padroes.gof.model.Customer;

public interface CustomerService {

	Iterable<Customer> findAll();	
	Customer findById(Long id);
	void insert(Customer customer);
	void update(Long id, Customer customer);
	void delete(Long id);
	
}
