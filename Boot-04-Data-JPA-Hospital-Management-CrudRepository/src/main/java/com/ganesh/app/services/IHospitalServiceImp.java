package com.ganesh.app.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ganesh.app.entity.HospitalEntity;
import com.ganesh.app.repo.IHospitalRepo;

@Service
public class IHospitalServiceImp implements IHospitalService {

	@Autowired
	private IHospitalRepo hospitalRepo;

	// save(Entity entity)

	@Override
	public String registerHospitalSave(HospitalEntity entity) {
		HospitalEntity entity2 = hospitalRepo.save(entity);
		return entity2.getId() + " record is inserted.";
	}

	// saveAll(List list)

	@Override
	public Iterable<HospitalEntity> registerHospitalSaveAll(List<HospitalEntity> list) {
		return hospitalRepo.saveAll(list);
	}

	// Updating Using Save(Entity entity)

	@Override
	public String updateRecord(HospitalEntity entity) {
		Optional<HospitalEntity> optional = hospitalRepo.findById(entity.getId());
		if (optional.isPresent()) {
			hospitalRepo.save(entity);
			return entity.getId() + " record is updated successfully!";
		} else {
			return entity.getId() + " is not found for updating.";
		}
	}

	// Updating using saveAll()
	@Override
	public Iterable<HospitalEntity> updateRecords(List<HospitalEntity> entities) {
		List<HospitalEntity> updatedEntities = new ArrayList<>();
		for (HospitalEntity entity : entities) {
			if (entity.getId() != null && hospitalRepo.existsById(entity.getId())) {
				updatedEntities.add(entity);
			} else {
				throw new RuntimeException("Record with ID " + entity.getId() + " does not exist.");
			}
		}
		return hospitalRepo.saveAll(updatedEntities);
	}

}
