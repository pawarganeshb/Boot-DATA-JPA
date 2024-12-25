package com.ganesh.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.ganesh.app.entity.Doctor;

public interface IDoctorRepository extends CrudRepository<Doctor, Integer> {
	

}
