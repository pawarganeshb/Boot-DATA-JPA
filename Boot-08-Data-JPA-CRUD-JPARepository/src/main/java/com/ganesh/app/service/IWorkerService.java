package com.ganesh.app.service;

import java.util.List;

import com.ganesh.app.entity.WorkerEntity;

public interface IWorkerService {
	public String saveWorkerBySaveAllAndFlush(List<WorkerEntity> workers);

	public Iterable<WorkerEntity> findAllWorkers();

	public boolean updateWorkers(List<WorkerEntity> ids);

	public Iterable<WorkerEntity> sortWorkers(boolean ascOrder, String... props);

	public Iterable<WorkerEntity> sortByPagingAndSorting(int pageSize,int pageCount,boolean order, String... props);
	
	public boolean deleteByIDS(Iterable<Integer> ids);
}
