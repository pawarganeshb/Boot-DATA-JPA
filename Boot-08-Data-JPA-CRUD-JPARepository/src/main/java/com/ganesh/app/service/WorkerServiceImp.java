package com.ganesh.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.ganesh.app.entity.WorkerEntity;
import com.ganesh.app.repo.IWorkerRepo;

@Service("myService")
public class WorkerServiceImp implements IWorkerService {

	@Autowired
	private IWorkerRepo iWorkerRepo;

	@Override
	public String saveWorkerBySaveAllAndFlush(List<WorkerEntity> workers) {
		iWorkerRepo.saveAllAndFlush(workers);
		Long count = iWorkerRepo.count();
		return count + " Record(s) has been inserted.";
	}

	@Override
	public Iterable<WorkerEntity> findAllWorkers() {
		return iWorkerRepo.findAll();
	}

	@Override
	public boolean updateWorkers(List<WorkerEntity> ids) {
		if (ids != null) {
			iWorkerRepo.saveAll(ids);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Iterable<WorkerEntity> sortWorkers(boolean ascOrder, String... props) {
		Sort sort = Sort.by(ascOrder ? Direction.ASC : Direction.DESC, props);
		return iWorkerRepo.findAll(sort);
	}

	@Override
	public Iterable<WorkerEntity> sortByPagingAndSorting(int start, int pageCount, boolean order, String... props) {
		Sort sort = Sort.by(order ? Direction.ASC : Direction.DESC, props);
		Pageable pageable = PageRequest.of(start, pageCount, sort);
		return iWorkerRepo.findAll(pageable);
	}

	@Override
	public boolean deleteByIDS(Iterable<Integer> ids) {
		iWorkerRepo.deleteAllByIdInBatch(ids);
		return true;
	}
}
