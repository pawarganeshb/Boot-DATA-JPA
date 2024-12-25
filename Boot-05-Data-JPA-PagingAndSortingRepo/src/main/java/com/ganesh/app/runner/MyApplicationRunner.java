package com.ganesh.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ganesh.app.services.IHospitalService;

@Component("customRunner")
public class MyApplicationRunner implements CommandLineRunner {

	@Autowired
	private IHospitalService hospitalService;

	@Override
	public void run(String... args) throws Exception {

		/*		try {
					Page<HospitalEntity> page = hospitalService.showHospitalDetailByPageNo(0, 12, false, "name");
					System.out.println("Page Number: " + page.getNumber());
					System.out.println("Page Count: " + page.getTotalPages());
					System.out.println("is it first page: " + page.isFirst());
					System.out.println("is Last Page: " + page.isLast());
					System.out.println("Page Size: " + page.getSize());
					System.out.println("Page Element Count: " + page.getNumberOfElements());
		
					if (!page.isEmpty()) {
						page.forEach(e -> System.out.println(e));
					} else {
						System.out.println("Page is not present.");
					}
				} catch (Exception e) {
					System.out.println("Paging sorting not did well " + e);
				}
		*/

		try {
			hospitalService.showHospitalInfoPageByPage(12, 1, true, "name", "salary");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
