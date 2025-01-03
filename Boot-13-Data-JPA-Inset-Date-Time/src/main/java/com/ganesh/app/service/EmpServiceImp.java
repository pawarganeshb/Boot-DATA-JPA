package com.ganesh.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ganesh.app.entity.EmpEntity;
import com.ganesh.app.repo.IEmprepo;

@Service
public final class EmpServiceImp implements IEmpService {

	@Autowired
	private IEmprepo emprepo;

	@Override
	public String registerEmployee(EmpEntity empEntity) {
		Long empId = emprepo.save(empEntity).getEmpId();
		return "Record is inseted with " + empId;
	}

	@Override
	public EmpEntity getEmpById(long empId) {
		EmpEntity referenceById = emprepo.getReferenceById(empId);
		return referenceById;
	}

}
