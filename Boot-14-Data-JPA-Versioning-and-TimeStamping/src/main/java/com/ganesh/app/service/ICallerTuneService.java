package com.ganesh.app.service;

import java.util.List;

import com.ganesh.app.entity.CallerTuneEntity;

public interface ICallerTuneService {
	public String saveCallerTune(CallerTuneEntity callerTuneEntity);

	public String updateCallerTune(Integer id, String tuneName, String movieName);

	public List<CallerTuneEntity> getCallerTunes();

	public boolean deleteById(int id);
}
