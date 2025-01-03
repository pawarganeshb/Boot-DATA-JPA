package com.ganesh.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ganesh.app.entity.CallerTuneEntity;
import com.ganesh.app.repo.ICallerTuneRepo;

@Service
public class CallerTuneServiceImple implements ICallerTuneService {
	@Autowired
	private ICallerTuneRepo callerTuneRepo;

	@Override
	public String saveCallerTune(CallerTuneEntity callerTuneEntity) {
		Integer id = callerTuneRepo.save(callerTuneEntity).getId();
		return id + " is registerd successfully!";
	}

	@Override
	public String updateCallerTune(Integer id, String tuneName, String movieName) {
		Optional<CallerTuneEntity> optional = callerTuneRepo.findById(id);
		if (optional.isPresent()) {
			CallerTuneEntity callerTuneEntity = optional.get();
			callerTuneEntity.setTuneName(tuneName);
			callerTuneEntity.setMovieName(movieName);
			callerTuneRepo.save(callerTuneEntity);
			return id + " record is updated!";
		}
		return "Unable to update!";
	}

	@Override
	public List<CallerTuneEntity> getCallerTunes() {
		return callerTuneRepo.findAll();
	}

	@Override
	public boolean deleteById(int id) {
		Optional<CallerTuneEntity> optional = callerTuneRepo.findById(id);
		if (optional.isPresent()) {
			callerTuneRepo.deleteById(id);
			return true;
		}
		return false;

	}

}
