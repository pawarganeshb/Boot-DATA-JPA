package com.ganesh.repository;

import org.springframework.data.repository.CrudRepository;

import com.ganesh.entity.Customer;

public interface ICustomerRepository extends CrudRepository<Customer, Integer> {
	
}
