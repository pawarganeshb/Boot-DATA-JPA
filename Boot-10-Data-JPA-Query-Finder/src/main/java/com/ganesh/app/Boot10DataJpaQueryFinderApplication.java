package com.ganesh.app;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Boot10DataJpaQueryFinderApplication {

	public static void main(String[] args) {
		SpringApplication.run(Boot10DataJpaQueryFinderApplication.class, args);
		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
	}

}
