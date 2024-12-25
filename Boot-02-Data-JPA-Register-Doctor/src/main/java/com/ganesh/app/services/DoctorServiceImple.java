package com.ganesh.app.services;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ganesh.app.entity.Doctor;
import com.ganesh.app.repository.IDoctorRepository;

@Service("doctorService")
public class DoctorServiceImple implements IDoctorServices {

	@Autowired
	IDoctorRepository doctorRepo;

	@Override
	public String insertData(Doctor doctor) {
		System.out.println("Doctor id before inserted data: " + doctor.getDId());
		Doctor doc = doctorRepo.save(doctor);
		return "Doctor id after inserted data: " + doc.getDId();
	}

	@Override
	public String insertDataMoreThanOne(Iterable<Doctor> doctors) {
	    if (doctors != null) {            
	        Iterable<Doctor> savedDoctors = doctorRepo.saveAll(doctors);
	        
	        // Ensure savedDoctors is a Collection to get the size
	        if (savedDoctors instanceof Collection) {
	            int size = ((Collection<Doctor>) savedDoctors).size();
	            List<Integer> ids = ((Collection<Doctor>) savedDoctors)
	                .stream()
	                .map(Doctor::getDId)
	                .collect(Collectors.toList());
	            
	            return "Number of doctors saved: " + size + ", with IDs: " + ids;
	        } else {
	            throw new IllegalStateException("Saved doctors is not a Collection");
	        }
	    } else {
	        throw new IllegalArgumentException("Input doctors iterable is null");
	    }
	}


}
