package com.ganesh.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ganesh.app.entity.CustomerEntity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureQuery;

@Service("customerService")
public class CustomerServiceImp implements ICustomerService {

	@Autowired
	private EntityManager entityManager;

	@Override
	public List<CustomerEntity> getCustomerInRange(double startRange, double endRange) {
		StoredProcedureQuery procedure = entityManager.createStoredProcedureQuery("P_Get_Customer_DetailByBillAmt",CustomerEntity.class);
		procedure.registerStoredProcedureParameter(1, Float.class, ParameterMode.IN);
		procedure.registerStoredProcedureParameter(2, Float.class, ParameterMode.IN);
		procedure.setParameter(1, startRange);
		procedure.setParameter(2, endRange);
		List<CustomerEntity> list = procedure.getResultList();
		return list;
	}

}
