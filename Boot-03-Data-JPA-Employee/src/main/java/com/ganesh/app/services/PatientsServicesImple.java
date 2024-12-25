package com.ganesh.app.services;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ganesh.app.entity.Patients;
import com.ganesh.app.repository.IPatientsRepositoroy;

@Service("PatientsService")
public class PatientsServicesImple implements IPatientsServices {
	@Autowired
	private IPatientsRepositoroy repo;

	@Override
	public String saveData(Patients emp) {
		System.out.println("PatientsServicesImple.saveData() before id" + emp.getEmpNo());
		Patients e = repo.save(emp);
		return "Data inserted with id" + e.getEmpNo();
	}

	@Override
	public String saveAllData(Iterable<Patients> emp) {
		Iterable<Patients> e = repo.saveAll(emp);
		List<Integer> emps = ((Collection<Patients>) e).stream().map(Patients::getEmpNo).collect(Collectors.toList());
		int size = ((Collection<Patients>) e).size();
		System.out.println(size);
		return "Collections objects after saved " + emps.get(size - 1);
	}

	@Override
	public boolean isAvailble(Integer patients) {
		boolean flag = repo.existsById(patients);
		return flag;
	}

	@Override
	public Long totalPatients() {
		Long count = repo.count();
		return count;
	}

	@Override
	public Iterable<Patients> findAllPatients() {
		return repo.findAll();
	}

	@Override
	public Iterable<Patients> findAllPatientsByID(Iterable<Integer> patients) {
		return repo.findAllById(patients);
	}

	@Override
	public Optional<Patients> findByIdPatients(int id) {
		return repo.findById(id);
	}

	@Override
	public String updatePatient(Patients pts) {
		Optional<Patients> patient = repo.findById(pts.getEmpNo());
		if (!patient.isPresent()) {
			return "Patients is not found.";
		} else {
			repo.save(pts);
			return "Updated Successfully!";
		}
	}

	@Override
	public String detetePatient(Patients pts) {
		Optional<Patients> oPatient = repo.findById(pts.getEmpNo());
		if (!oPatient.isEmpty()) {
			repo.delete(pts);
			return pts.getEmpNo() + " has been deleted!";
		} else {
			return pts.getEmpNo() + " patient is not found.";
		}
	}

	@Override
	public String deleteByIdPatient(Patients pts) {
		Optional<Patients> p = repo.findById(pts.getEmpNo());
		if (p.isPresent()) {
			repo.deleteById(pts.getEmpNo());
			return pts.getEmpNo() + " has been deleted!";
		} else {
			return "Given id not found.";
		}
	}

	@Override
	public String delete(List<Integer> ids) {
		List<Patients> patientsList = (List<Patients>) repo.findAllById(ids);

		if (ids.size() == patientsList.size()) {
			repo.deleteAll(patientsList);
			return ids + "are deleted";
		} else {
			return ids + " are not found";
		}
	}

	@Override
	public String deleteAll() {
		Long count = repo.count();
		repo.deleteAll();
		return count + " record are deleted";
	}
}
