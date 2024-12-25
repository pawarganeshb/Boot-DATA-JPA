package com.ganesh.app.runners;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.ganesh.app.entity.Patients;
import com.ganesh.app.services.IPatientsServices;

@Component
public class MyRunner implements ApplicationRunner {

	@Autowired
	IPatientsServices service;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		// Updating Patient using save() method from crudRepository

		/*try {
			Patients p = new Patients(408, "Ang Raj Karn", "Wariour", 78000.12);
			String updateMsg = service.updatePatient(p);
			System.out.println(updateMsg);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}*/

		// Deleting Patient using delete(Entity entity) method from crudRepository

		/*try {
			Patients p = new Patients(100, "Ang Raj Karn", "Warrior", 12000.0);
			System.out.println(service.detetePatient(p));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}*/

		// deleteById(ID)

		/*try {
			Patients p = new Patients(3240, "Karan", "War Department", 741.123);
			System.out.println(service.deleteByIdPatient(p));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}*/

		// deleteByID(IDs)
		try {
			System.out.println(service.delete(List.of(309, 312, 315, 318, 321)));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		// deleteAll()

		try {
			System.out.println(service.deleteAll());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {

			Patients p1 = new Patients(0, "Abhi", "Kabhi", 121.3);
			Patients p2 = new Patients(0, "Bhabi", "Madhi", 121.3);
			Patients p3 = new Patients(0, "Chachi", "khabhi", 121.3);
			String msg = service.saveAllData(List.of(p1, p2, p3));
			System.out.println(msg);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// Fetching all patients using findAll method from crudrRepository
		try {
			Iterable<Patients> p = service.findAllPatients();

			p.forEach(e -> System.out.println(e));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
