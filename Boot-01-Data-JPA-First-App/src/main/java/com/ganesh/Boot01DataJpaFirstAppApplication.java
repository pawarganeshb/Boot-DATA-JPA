package com.ganesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.ganesh.entity.Customer;
import com.ganesh.service.CustoemrServiceImp;

@SpringBootApplication
public class Boot01DataJpaFirstAppApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Boot01DataJpaFirstAppApplication.class, args);
		CustoemrServiceImp service = context.getBean(CustoemrServiceImp.class);
		try {
			Customer customer = new Customer();
			customer.setCName("David");
			customer.setCProduct("Dron");
			customer.setCBillAmt(1500.0);
			String msg = service.registerCustomer(customer);
			System.out.println(msg);
		} catch (Exception e) {
			e.printStackTrace();
		}
		((ConfigurableApplicationContext) context).close();

	}

}
