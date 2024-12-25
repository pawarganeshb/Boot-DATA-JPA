package com.ganesh.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ganesh.app.entity.EmpEntity;

public interface IEmprepo extends JpaRepository<EmpEntity, Long> {

}
