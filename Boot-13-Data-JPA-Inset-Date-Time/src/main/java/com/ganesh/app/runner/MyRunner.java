package com.ganesh.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ganesh.app.entity.EmpEntity;
import com.ganesh.app.service.IEmpService;

@Component
public class MyRunner implements CommandLineRunner {

	@Autowired
	private IEmpService empService;

	@Override
	public void run(String... args) throws Exception {
		/*try {
			System.out.println(empService.registerEmployee(new EmpEntity(null, "Sam", 75000.0,
					LocalDate.of(2024, 12, 12), LocalDateTime.now(), LocalTime.now())));
		
		} catch (Exception e) {
			e.printStackTrace();
		}*/

		try {
			EmpEntity empEntity = empService.getEmpById(1);
			System.out.println(empEntity);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
