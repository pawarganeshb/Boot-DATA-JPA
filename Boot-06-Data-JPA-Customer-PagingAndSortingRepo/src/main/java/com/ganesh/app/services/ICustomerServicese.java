package com.ganesh.app.services;

import com.ganesh.app.entity.Customer;

public interface ICustomerServicese {
	public Iterable<Customer> sortCustomer(boolean flag, String... props);

	public Iterable<Customer> sortCustomerPageByPage(int pageNo, boolean flag, String props);
}
