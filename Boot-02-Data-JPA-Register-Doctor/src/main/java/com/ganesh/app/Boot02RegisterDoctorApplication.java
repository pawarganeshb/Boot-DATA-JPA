package com.ganesh.app;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ganesh.app.entity.Doctor;
import com.ganesh.app.services.DoctorServiceImple;

@SpringBootApplication
public class Boot02RegisterDoctorApplication {

	public static void main(String[] args) {
		try(ConfigurableApplicationContext context = SpringApplication.run(Boot02RegisterDoctorApplication.class, args);){
		 DoctorServiceImple service = context.getBean("doctorService",DoctorServiceImple.class);
		 
		 try {
			    Doctor doc1 = new Doctor();
			    doc1.setDName("Ganesh"); doc1.setShiftTime("03 AM To 06 PM"); doc1.setDepartment("Cardio");
			    
			    Doctor doc2 = new Doctor();
			    doc1.setDName("Ganesh"); doc1.setShiftTime("03 AM To 06 PM"); doc1.setDepartment("Guynology");

			    Doctor doc3 = new Doctor();
			    doc3.setDName("valmiki1"); doc3.setShiftTime("06 AM To 09 PM"); doc3.setDepartment("Ortho");
			    
			    String msg = service.insertDataMoreThanOne(List.of(doc1, doc2, doc3));
			    
			    
			    System.out.println(msg);
			    
			} catch (Exception e) {
			    e.printStackTrace();
			}

		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
