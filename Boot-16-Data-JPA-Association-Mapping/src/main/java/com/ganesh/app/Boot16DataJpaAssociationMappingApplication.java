package com.ganesh.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Boot16DataJpaAssociationMappingApplication {

	public static void main(String[] args) {
		SpringApplication.run(Boot16DataJpaAssociationMappingApplication.class, args);
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(1);
		list.add(3);
		list.add(3);
		list.add(7);
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < map.size(); i++) {
			Integer count = list.get(i);
			if (count == 0) {
				count = new Integer(0);
			}
			count++;
			map.put(list.get(i), count);
		}
	}

}
