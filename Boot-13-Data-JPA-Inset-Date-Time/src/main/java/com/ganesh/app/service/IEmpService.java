package com.ganesh.app.service;

import com.ganesh.app.entity.EmpEntity;

public interface IEmpService {
	public String registerEmployee(EmpEntity empEntity);

	public EmpEntity getEmpById(long empId);
}
