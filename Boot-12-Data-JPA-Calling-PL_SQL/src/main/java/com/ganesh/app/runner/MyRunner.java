package com.ganesh.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ganesh.app.service.IHsospitalService;

@Component
public class MyRunner implements CommandLineRunner {
	@Autowired
	private IHsospitalService service;

	@Override
	public void run(String... args) throws Exception {
		try {
			service.getAllRecord().forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
