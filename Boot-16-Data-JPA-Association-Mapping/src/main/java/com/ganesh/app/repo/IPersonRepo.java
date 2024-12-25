package com.ganesh.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ganesh.app.entity.Person;

public interface IPersonRepo extends JpaRepository<Person, Integer> {

}
