package com.ganesh.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.ganesh.app.entity.Customer;
import com.ganesh.app.repository.ICustomerRepo;

@Service("customerService")
public final class CustomerServiceImple implements ICustomerServicese {

	@Autowired
	private ICustomerRepo customerRepo;

	@Override
	public boolean deleteByAllByIdInBatchCustomer(List<Integer> ids) {
		if (ids != null) {
			customerRepo.deleteAllByIdInBatch(ids);
			System.out.println(ids.size());
			return true;

		} else {
			return false;
		}
	}

	@Override
	public Customer getCustomerById(int id) {
		boolean b = customerRepo.existsById(id);
		if (b) {
			return customerRepo.getReferenceById(id);
		} else {
			return null;
		}
	}

	@Override
	public List<Customer> findAllByExample(Customer customer, boolean ascOrder, String... props) {
		Sort sort = Sort.by(ascOrder ? Direction.ASC : Direction.DESC, props);
		Example<Customer> example = Example.of(customer);
		List<Customer> customers = customerRepo.findAll(example, sort);
		return customers;
	}
}
