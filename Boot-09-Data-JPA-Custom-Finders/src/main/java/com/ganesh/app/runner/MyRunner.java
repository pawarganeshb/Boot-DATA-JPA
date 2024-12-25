package com.ganesh.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ganesh.app.repo.ICustomerRepo;

@Component("myRunner")
public class MyRunner implements CommandLineRunner {

	@Autowired
	private ICustomerRepo customerRepo;

	@Override
	public void run(String... args) throws Exception {
		/*try {
			customerRepo.findByCamtIsGreaterThanEqual(2000f).forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}*/

		try {
			customerRepo.findByNameStartingWith("E").forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
