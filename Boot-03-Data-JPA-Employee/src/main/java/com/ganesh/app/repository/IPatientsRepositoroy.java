package com.ganesh.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.ganesh.app.entity.Patients;

public interface IPatientsRepositoroy extends CrudRepository<Patients, Integer> {

}
