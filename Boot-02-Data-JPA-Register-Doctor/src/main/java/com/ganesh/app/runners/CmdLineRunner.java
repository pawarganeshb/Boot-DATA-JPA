package com.ganesh.app.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ganesh.app.entity.Doctor;
import com.ganesh.app.services.IDoctorServices;

@Component
public class CmdLineRunner implements CommandLineRunner {
	@Autowired
	private IDoctorServices service;

	@Override
	public void run(String... args) throws Exception {
		Doctor doctor = new Doctor(0, "Gokul", "03 PM To 06 PM", "Blood Tester");
		service.insertData(doctor);
	}

}
