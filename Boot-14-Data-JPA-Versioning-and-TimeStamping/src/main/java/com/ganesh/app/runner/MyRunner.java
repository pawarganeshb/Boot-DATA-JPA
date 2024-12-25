package com.ganesh.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ganesh.app.service.ICallerTuneService;

@Component
public class MyRunner implements CommandLineRunner {
	@Autowired
	private ICallerTuneService callerTuneService;

	@Override
	public void run(String... args) throws Exception {
		/*try {
			CallerTuneEntity callerTuneEntity = new CallerTuneEntity("Me Too", "Too me");
			String msg = callerTuneService.saveCallerTune(callerTuneEntity);
			System.out.println(msg);
		} catch (Exception e) {
			e.printStackTrace();
		}*/

		/*try {
			String saveCallerTune = callerTuneService.updateCallerTune(2, "Raghu Nandan", "Hanuman");
			System.err.println(saveCallerTune);
		} catch (Exception e) {
			e.printStackTrace();
		}*/

		/*try {
			callerTuneService.getCallerTunes().forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}*/

		try {
			boolean deleteById = callerTuneService.deleteById(2);
			System.out.println(deleteById ? "Record has been deleted!" : "Unable to delete record.");
		} catch (Exception e) {

		}

	}

}
