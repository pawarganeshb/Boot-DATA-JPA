package com.ganesh.app.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.ganesh.app.entity.HospitalEntity;

public interface IHospitalRepo extends PagingAndSortingRepository<HospitalEntity, Integer>,CrudRepository<HospitalEntity, Integer> {

}
