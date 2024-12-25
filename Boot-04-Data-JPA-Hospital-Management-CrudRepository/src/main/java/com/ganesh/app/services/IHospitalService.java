package com.ganesh.app.services;

import java.util.List;

import com.ganesh.app.entity.HospitalEntity;

public interface IHospitalService {
	// save()
	public String registerHospitalSave(HospitalEntity entity);

	// saveAll()
	public Iterable<HospitalEntity> registerHospitalSaveAll(List<HospitalEntity> list);

	// save() for updating
	public String updateRecord(HospitalEntity entity);

	// saveAll() for updating
	public Iterable<HospitalEntity> updateRecords(List<HospitalEntity> entities);
	
	
}
