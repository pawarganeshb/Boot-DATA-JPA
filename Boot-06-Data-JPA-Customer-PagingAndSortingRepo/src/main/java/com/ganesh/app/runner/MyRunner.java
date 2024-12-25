package com.ganesh.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.ganesh.app.services.ICustomerServicese;

@Component("myRunner")
public class MyRunner implements ApplicationRunner {
	@Autowired
	private ICustomerServicese customerServicese;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		/*try {
			Iterable<Customer> iterable = customerServicese.sortCustomer(true, "name");
			iterable.forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}*/

		try {
			customerServicese.sortCustomerPageByPage(5, true, "name");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}