package com.ganesh.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ganesh.app.service.ICustomerService;

@Component
public class MyRunnner implements CommandLineRunner {

	@Autowired
	private ICustomerService customerService;

	@Override
	public void run(String... args) throws Exception {
		customerService.getCustomerInRange(5000, 6000).forEach(System.err::println);
	}

}