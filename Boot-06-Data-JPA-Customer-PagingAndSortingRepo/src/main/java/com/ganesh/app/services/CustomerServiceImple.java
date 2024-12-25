package com.ganesh.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.ganesh.app.entity.Customer;
import com.ganesh.app.repository.ICustomerRepo;

@Service("customerService")
public class CustomerServiceImple implements ICustomerServicese {
	@Autowired
	private ICustomerRepo customerRepo;

	@Override
	public Iterable<Customer> sortCustomer(boolean flag, String... props) {
		Sort sort = Sort.by(flag ? Direction.ASC : Direction.DESC, props);
		Iterable<Customer> iterable = customerRepo.findAll(sort);
		return iterable;
	}

	@Override
	public Iterable<Customer> sortCustomerPageByPage(int pageSize, boolean flag, String prop) {
		Sort sort = Sort.by(flag ? Direction.ASC : Direction.DESC, prop);
		long count = customerRepo.count();
		long pageCount = count / pageSize;
		pageCount = (count % pageSize == 0) ? pageCount : ++pageCount;
		for (int i = 0; i < pageCount; i++) {
			Pageable pageable = PageRequest.of(i, pageSize,sort);
			Page<Customer> page = customerRepo.findAll(pageable);
			page.forEach(r -> System.out.println(r));
			System.out.println(
					"================" + page.getNumber() + 1 + "/" + page.getTotalPages() + "======================");
		}
		return null;
	}

}
