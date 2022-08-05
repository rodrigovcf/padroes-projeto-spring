package com.padroes.gof.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.padroes.gof.model.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long>{

}
