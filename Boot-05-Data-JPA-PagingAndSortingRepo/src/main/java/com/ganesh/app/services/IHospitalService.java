package com.ganesh.app.services;

import org.springframework.data.domain.Page;

import com.ganesh.app.entity.HospitalEntity;

public interface IHospitalService {

	public Iterable<HospitalEntity> showRecordsBysorting(boolean asc, String... args);

	public Iterable<HospitalEntity> sortByName(boolean asc, String... properties);

	public Page<HospitalEntity> showHospitalDetailByPageNo(int pageNo, int pageSize, boolean ascOrder, String props);

	public void showHospitalInfoPageByPage(int pageNo, int pageSize, boolean isSort, String... props);
}
