package com.ganesh.app.services;

import java.util.List;
import java.util.Optional;

import com.ganesh.app.entity.Patients;

public interface IPatientsServices {
	public String saveData(Patients emp);

	public String saveAllData(Iterable<Patients> emp);

	public boolean isAvailble(Integer patients);

	public Long totalPatients();

	public Iterable<Patients> findAllPatients();

	public Iterable<Patients> findAllPatientsByID(Iterable<Integer> patients);

	public Optional<Patients> findByIdPatients(int id);

	public String updatePatient(Patients pts);
	
	public String detetePatient(Patients pts);
	
	public String deleteByIdPatient(Patients pts);
	
	public String delete(List<Integer>id);
	
	public String deleteAll();
}
