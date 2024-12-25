package com.ganesh.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ganesh.app.entity.CustomerEntity;

public interface ICustomerRepo extends JpaRepository<CustomerEntity, Integer> {
	// Query to fetch customers whose `camt` is between the specified range
	// @Query("SELECT c FROM CustomerEntity c WHERE c.camt > ?1 AND c.camt < ?2")
	@Query("SELECT c FROM CustomerEntity c WHERE c.camt > ?1")
	public List<CustomerEntity> searchProductByPriceRange(float startPrice, float endPrice);

	public List<CustomerEntity> findByNameAllIgnoreCase(String str);

	@Query("SELECT COUNT(*) FROM CustomerEntity")
	public Long countCustomer();

}
