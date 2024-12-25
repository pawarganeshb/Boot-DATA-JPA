package com.ganesh.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ganesh.app.entity.MatrimonyEntity;

public interface IMatrimoyRepo extends JpaRepository<MatrimonyEntity, Long> {

}
