package com.ganesh.app.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.ganesh.app.entity.Customer;
import com.ganesh.app.repository.ICustomerRepo;
import com.ganesh.app.services.ICustomerServicese;

@Component("myRunner")
public class MyRunner implements ApplicationRunner {
	@Autowired
	private ICustomerServicese customerServicese;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		/*try {
			boolean flag = customerServicese.deleteByAllByIdInBatchCustomer(List.of(52, 102, 152, 100));
			System.err.println(flag ? "Given Customers are deleted." : "Unable to delete customers.");
		} catch (Exception e) {
			e.printStackTrace();
		}*/

		/*try {
			Customer customer = customerServicese.getCustomerById(10);
			if (customer != null) {
				System.out.println(customer);
			} else {
				System.out.println("Customer is not found!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		//FindAll(Example<> sort)
		
		try {
			Customer customer = new Customer();
			List<Customer> list = customerServicese.findAllByExample(customer, false, "name");
			if (list == null) {
				System.err.println("customer is not found.");
			} else {
				list.forEach(System.err::println);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}