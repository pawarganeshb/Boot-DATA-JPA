package com.ganesh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ganesh.entity.Customer;
import com.ganesh.repository.ICustomerRepository;

@Service("service")
public class CustoemrServiceImp implements ICustomerService {

	@Autowired
	private ICustomerRepository repo;

	@Override
	public String registerCustomer(Customer customer) {
		System.out.println("customer id before inserted: " + customer.getCNo());
		Customer c = repo.save(customer);
		return "Customer data inserted with id: " + c.getCNo();
	}

}
