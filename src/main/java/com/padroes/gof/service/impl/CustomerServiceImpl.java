package com.padroes.gof.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.padroes.gof.model.AddressCustomer;
import com.padroes.gof.model.Customer;
import com.padroes.gof.repository.AddressRepository;
import com.padroes.gof.repository.CustomerRepository;
import com.padroes.gof.service.CustomerService;
import com.padroes.gof.service.ViaCepService;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private AddressRepository addressRepository;
	
	@Autowired
	private ViaCepService viaCepService;

	@Override
	public Iterable<Customer> findAll() {
		return customerRepository.findAll();
	}

	@Override
	public Customer findById(Long id) {
		Optional<Customer> customer = customerRepository.findById(id);
		return customer.get();
	}

	@Override
	public void insert(Customer customer) {
		saveCustomerByCep(customer);
	}

	@Override
	public void update(Long id, Customer customer) {
		Optional<Customer> customerDb = customerRepository.findById(id);
		if (customerDb.isPresent())
			saveCustomerByCep(customer);
	}

	@Override
	public void delete(Long id) {
		customerRepository.deleteById(id);
	}
	
	private void saveCustomerByCep(Customer customer) {
		String cep = customer.getAddress().getCep();
		AddressCustomer address = addressRepository.findById(cep).orElseGet(() -> {
			AddressCustomer newAddress = viaCepService.findByCep(cep);
			addressRepository.save(newAddress);
			return newAddress;
		});
		
		customer.setAddress(address);
		customerRepository.save(customer);
	}

}
