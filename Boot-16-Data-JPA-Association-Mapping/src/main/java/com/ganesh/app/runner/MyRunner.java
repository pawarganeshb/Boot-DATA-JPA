package com.ganesh.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ganesh.app.service.IAssociationMappingService;

@Component
public class MyRunner implements CommandLineRunner {
	@Autowired
	private IAssociationMappingService service;

	@Override
	public void run(String... args) throws Exception {
		/*try {
			service.saveDataUsingParent();
		} catch (Exception e) {
			e.printStackTrace();
		}*/

			try {
				service.loadDataUsingParent();
			} catch (Exception e) {
				e.printStackTrace();
			}

		/*try {
			service.saveDataUsingChild();
		} catch (Exception e) {
			e.printStackTrace();
		}*/

	}

}
