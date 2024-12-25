package com.ganesh.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.ganesh.app.entity.Customer;

public interface ICustomerRepo
		extends PagingAndSortingRepository<Customer, Integer>, CrudRepository<Customer, Integer> {

}
