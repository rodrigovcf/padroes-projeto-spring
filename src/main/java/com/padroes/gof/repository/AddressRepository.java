package com.padroes.gof.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.padroes.gof.model.AddressCustomer;

@Repository
public interface AddressRepository extends CrudRepository<AddressCustomer, String> {
	

}
