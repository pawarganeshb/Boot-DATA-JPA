package com.ganesh.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ganesh.app.entity.CallerTuneEntity;

public interface ICallerTuneRepo extends JpaRepository<CallerTuneEntity, Integer> {

}