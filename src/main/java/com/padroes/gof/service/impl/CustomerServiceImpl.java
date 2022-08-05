package com.padroes.gof.service.impl;

import org.springframework.stereotype.Service;

import com.padroes.gof.model.Customer;
import com.padroes.gof.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Override
	public Iterable<Customer> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Long id, Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

}
