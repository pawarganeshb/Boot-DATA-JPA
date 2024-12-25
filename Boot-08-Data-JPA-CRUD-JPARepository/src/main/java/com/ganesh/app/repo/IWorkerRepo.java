package com.ganesh.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ganesh.app.entity.WorkerEntity;

public interface IWorkerRepo extends JpaRepository<WorkerEntity, Integer> {

}
