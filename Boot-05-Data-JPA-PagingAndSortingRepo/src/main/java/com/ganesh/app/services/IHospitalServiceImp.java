package com.ganesh.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.ganesh.app.entity.HospitalEntity;
import com.ganesh.app.repo.IHospitalRepo;

@Service
public class IHospitalServiceImp implements IHospitalService {

	@Autowired
	private IHospitalRepo hospitalRepo;

	// From PagingAndSorting<T>

	@Override
	public Iterable<HospitalEntity> showRecordsBysorting(boolean asc, String... props) {
		Sort sort = Sort.by(asc ? Direction.ASC : Direction.DESC, props);
		return hospitalRepo.findAll(sort);
	}

	@Override
	public Iterable<HospitalEntity> sortByName(boolean asc, String... properties) {
		Sort sort = Sort.by(asc ? Direction.ASC : Direction.DESC, properties);
		return hospitalRepo.findAll(sort);
	}

	@Override
	public Page<HospitalEntity> showHospitalDetailByPageNo(int pageNo, int pageSize, boolean ascOrder, String props) {
		Sort sort = Sort.by(ascOrder ? Direction.ASC : Direction.DESC, props);
		Pageable pageable = PageRequest.of(pageNo, pageSize, sort);
		Page<HospitalEntity> page = hospitalRepo.findAll(pageable);
		return page;
	}

	@Override
	public void showHospitalInfoPageByPage(int pageNo, int pageSize, boolean isSort, String... props) {
		Sort sort = Sort.by(isSort ? Direction.ASC : Direction.DESC, props);
		long count = hospitalRepo.count();
		long pageCount = count / pageSize;
		pageCount = (count % pageSize == 0 ? pageCount : ++pageCount);
		for (int i = 0; i < pageCount; i++) {
			Pageable pageable = PageRequest.of(i, pageSize, sort);
			Page<HospitalEntity> page = hospitalRepo.findAll(pageable);
			page.forEach(System.out::println);
			System.out.println("==========" + page.getNumber() + "/" + page.getTotalPages() + "==========");
		}
	}

}
