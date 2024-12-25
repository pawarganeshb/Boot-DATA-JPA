package com.ganesh.app.services;

import com.ganesh.app.entity.Doctor;

public interface IDoctorServices{
	public String insertData(Doctor doctor);
	public String insertDataMoreThanOne(Iterable<Doctor> doctor);

}
