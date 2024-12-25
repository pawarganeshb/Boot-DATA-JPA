package com.ganesh.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ganesh.app.repo.ICustomerRepo;

@Component
public class MyRunnner implements CommandLineRunner {
	@Autowired
	private ICustomerRepo customerRopo;

	@Override
	public void run(String... args) throws Exception {
		try {

//			 customerRopo.searchProductByPriceRange(1000f,
//			 2000f).forEach(System.out::println);
//			 customerRopo.findByNameAllIgnoreCase("alex").forEach(System.out::println);
			long i = customerRopo.countCustomer();
			System.out.println("Total Customer: " + i);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}