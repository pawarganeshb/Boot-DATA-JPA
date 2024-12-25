package com.ganesh.app.repo;

import org.springframework.data.repository.CrudRepository;

import com.ganesh.app.entity.HospitalEntity;

public interface IHospitalRepo extends CrudRepository<HospitalEntity, Integer> {

}
