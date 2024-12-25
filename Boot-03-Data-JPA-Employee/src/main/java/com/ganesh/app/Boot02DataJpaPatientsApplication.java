package com.ganesh.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Boot02DataJpaPatientsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Boot02DataJpaPatientsApplication.class, args);
		{
			/*IPatientsServices service = context.getBean("PatientsService", IPatientsServices.class);
			Patients emp1 = new Patients(0, "Karn ", "Java", 34000.0);
			Patients emp2 = new Patients(0, "Sukhadev", "React", 35000.0);
			Patients emp3 = new Patients(0, "Nakul", "PHP", 36000.0);
			Patients emp4 = new Patients(0, "Karn ", "Java", 34000.0);
			Patients emp5 = new Patients(0, "Sukhadev", "React", 35000.0);
			Patients emp6 = new Patients(0, "Nakul", "PHP", 36000.0);
			String msg = service.saveAllData(List.of(emp1, emp2, emp3,emp4,emp5,emp6 ));
			try {
				boolean flag = service.isAvailble(308);
				if (flag) {
					System.out.println("Patients availble.");
				} else {
					System.out.println("Patients is not availble.");
				}
				System.err.println("Total Patients are: " + service.totalPatients());
				Iterable<Patients> p = service.findAllPatients();
				p.forEach(patietns -> System.out.println(patietns));
			
				service.findAllPatientsByID(List.of(308, 309, 310)).forEach(System.out::println);
				Optional<Patients> op = service.findByIdPatients(308);
				System.out.println("Find By ID:: ");
				op.stream().forEach(e -> System.out.println(e));
			*/
			context.close();
		}
		/*System.out.println(msg);
		} catch (Exception e) {
		e.printStackTrace();
		}*/
	}

}