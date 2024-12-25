package com.ganesh.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ganesh.app.entity.User;

public interface IUserRepo extends JpaRepository<User, Long> {

}
