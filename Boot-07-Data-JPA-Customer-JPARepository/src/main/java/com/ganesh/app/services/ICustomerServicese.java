package com.ganesh.app.services;

import java.util.List;

import com.ganesh.app.entity.Customer;

public interface ICustomerServicese {
	public boolean deleteByAllByIdInBatchCustomer(List<Integer> ids);

	public Customer getCustomerById(int id);

	public List<Customer> findAllByExample(Customer customer, boolean ascOrder, String... props);
}
