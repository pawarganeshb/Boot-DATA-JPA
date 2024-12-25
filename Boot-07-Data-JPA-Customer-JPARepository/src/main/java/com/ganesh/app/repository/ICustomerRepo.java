package com.ganesh.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ganesh.app.entity.Customer;

public interface ICustomerRepo extends JpaRepository<Customer, Integer> {

}
