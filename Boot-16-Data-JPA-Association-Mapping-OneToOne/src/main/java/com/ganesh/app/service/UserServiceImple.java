package com.ganesh.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ganesh.app.entity.User;
import com.ganesh.app.repo.IUserRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserServiceImple implements IUserService {
	@Autowired
	private IUserRepo userRepo;

	@Override
	public String saveUser(User user) {
		userRepo.save(user);
		return "User has been saved with id " + user.getId();
	}
}
