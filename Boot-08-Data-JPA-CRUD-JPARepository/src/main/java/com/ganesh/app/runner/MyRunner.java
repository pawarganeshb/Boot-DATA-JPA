package com.ganesh.app.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.ganesh.app.entity.WorkerEntity;
import com.ganesh.app.service.IWorkerService;

@Component("myRunner")
public class MyRunner implements ApplicationRunner {
	@Autowired
	private IWorkerService iWorkerService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		/*try {
		
			WorkerEntity w1 = new WorkerEntity(null, "Anvar Mehata", 45000.0f);
			WorkerEntity w2 = new WorkerEntity(null, "Ben Wen", 9000.0f);
			WorkerEntity w3 = new WorkerEntity(null, "Cindra Pawar", 4000.0f);
			WorkerEntity w4 = new WorkerEntity(null, "Dram Dron", 4570.0f);
		
			List<WorkerEntity> entities = List.of(w1, w2, w3, w4);
			String message = iWorkerService.saveWorkerBySaveAllAndFlush(entities);
			System.out.println(message);
		
		} catch (Exception e) {
			e.printStackTrace();
		}*/

		/*try {
			iWorkerService.findAllWorkers().forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}*/

		/*try {
			WorkerEntity w1 = new WorkerEntity(5, "Anvar Mehata", 500f);
			WorkerEntity w2 = new WorkerEntity(6, "Ben Wen", 600f);
			WorkerEntity w3 = new WorkerEntity(7, "Cindra Pawar", 700f);
			WorkerEntity w4 = new WorkerEntity(8, "Dram Dron", 800f);
			boolean updateWorkers = iWorkerService.updateWorkers(List.of(w1, w2, w3, w4));
			if (updateWorkers) {
				System.out.println("Updated records! ");
			} else {
				System.err.println("Unable to update!");
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		}*/

		/*try {
			iWorkerService.sortWorkers(true, "wName").forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}*/

		/*try {
			iWorkerService.sortByPagingAndSorting(1, 3, true, "wName").forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}*/

		try {
			boolean b = iWorkerService.deleteByIDS(List.of(5, 6, 7, 8));
			System.err.println(b ? "Deleted!" : "Not deleted");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
