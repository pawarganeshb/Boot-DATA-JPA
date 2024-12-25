package com.ganesh.app.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.ganesh.app.entity.HospitalEntity;
import com.ganesh.app.services.IHospitalService;

@Component
public class MyApplicationRunner implements ApplicationRunner {

	@Autowired
	private IHospitalService hospitalService;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		// insert => Save()

		/*try {
			HospitalEntity entity = new HospitalEntity();
			entity.setName("Paaji Hospital");
			entity.setOwner("Sardar Patel");
			entity.setSalary(900000.0);
			String message = hospitalService.registerHospitalSave(entity);
			System.err.println(message);
		} catch (Exception e) {
			e.printStackTrace();
		}*/

		// insert SaveAll()

		/*try {
			HospitalEntity entity1 = new HospitalEntity(0, "Karn Hospital", "Karan Warior", 68000.0);
			HospitalEntity entity2 = new HospitalEntity(0, "Yodha Hospital", "Takur Ji", 68000.0);
			HospitalEntity entity3 = new HospitalEntity(0, "Amar Hospital", "Maroti Dev", 68000.0);
			HospitalEntity entity4 = new HospitalEntity(0, "Jivan Hospital", "Kedar Nath", 68000.0);
			System.out.println(hospitalService.registerHospitalSaveAll(List.of(entity1, entity2, entity3, entity4)));
		} catch (Exception e) {
			e.printStackTrace();
		}*/
        
		// update using save()
		
		/*try {
			HospitalEntity entity = new HospitalEntity(112, "Health Care", "Hemant Karade", 789452.0);
			String message = hospitalService.updateRecord(entity);
			System.err.println(message);
		} catch (Exception e) {
			e.printStackTrace();
		}*/

		// update using save()
		try {
		    List<HospitalEntity> entities = Arrays.asList(
		        new HospitalEntity(111, "Health Care Updated", "John Doe", 800000.0),
		        new HospitalEntity(109, "City Hospital", "Jane Smith", 500000.0)
		    );
		    Iterable<HospitalEntity> updatedRecords = hospitalService.updateRecords(entities);
		    updatedRecords.forEach(record -> System.out.println("Updated: " + record));
		} catch (Exception e) {
		    e.printStackTrace();
		}

	}

}
