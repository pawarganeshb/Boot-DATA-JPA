package com.ganesh.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ganesh.app.entity.PhoneNumbers;

public interface IPhonNumberRepo extends JpaRepository<PhoneNumbers, Integer> {

}
