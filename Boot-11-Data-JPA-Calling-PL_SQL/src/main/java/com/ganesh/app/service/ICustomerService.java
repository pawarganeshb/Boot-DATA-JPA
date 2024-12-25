package com.ganesh.app.service;

import java.util.List;

import com.ganesh.app.entity.CustomerEntity;

public interface ICustomerService {
	public List<CustomerEntity> getCustomerInRange(double startRange, double endRange);
}