package com.ganesh.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ganesh.app.entity.CustomerEntity;

public interface ICustomerRepo extends JpaRepository<CustomerEntity, Integer> {
	List<CustomerEntity> findByName(String name);

	List<CustomerEntity> findByCamtIsGreaterThanEqual(Float camt);

	List<CustomerEntity> findByNameStartingWith(String name);

	List<CustomerEntity> findByProducts(String products);
}
