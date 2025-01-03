package com.ganesh.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ganesh.app.entity.MatrimonyEntity;
import com.ganesh.app.repo.IMatrimoyRepo;

@Service
public class MatrimonyServiceImp implements IMatrimonyService {
	@Autowired
	private IMatrimoyRepo iMatrimoyRepo;

	@Override
	public String register(MatrimonyEntity entity) {
		return "Merrige Seeker info is saved with id value: " + iMatrimoyRepo.save(entity).getId();
	}

}
