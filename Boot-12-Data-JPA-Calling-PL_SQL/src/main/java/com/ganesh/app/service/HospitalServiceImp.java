package com.ganesh.app.service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ganesh.app.entity.HospitalEntity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.StoredProcedureQuery;

@Service
public final class HospitalServiceImp implements IHsospitalService {

	@Autowired
	private EntityManager entityManager;

	@Override
	public List<HospitalEntity> getAllRecord() {
		StoredProcedureQuery storedProcedureQuery = entityManager.createStoredProcedureQuery("getRecords",
				HospitalEntity.class);
		List<HospitalEntity> resultList = storedProcedureQuery.getResultList();
		Collections.sort(resultList, Comparator.comparing(HospitalEntity::getHospital_name));
		
		return resultList;
	}

}
