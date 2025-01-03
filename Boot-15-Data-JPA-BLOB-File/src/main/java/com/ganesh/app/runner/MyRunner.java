package com.ganesh.app.runner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.Reader;
import java.time.LocalDateTime;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ganesh.app.entity.MatrimonyEntity;
import com.ganesh.app.repo.IMatrimoyRepo;
import com.ganesh.app.service.IMatrimonyService;

@Component
public class MyRunner implements CommandLineRunner {

	@Autowired
	private IMatrimonyService iMatrimoySer;

	@Override
	public void run(String... args) throws Exception {
		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("Enter person name::");
			String name = sc.nextLine();
			System.out.println("Enter person address::");
			String addrs = sc.nextLine();
			sc.nextLine();
			System.out.println("Enter Person Photo file complete path::");
			String photoPath = sc.next().replace("?", "");
			System.out.println("Enter Person biodata file complete path::");
			String biodataPath = sc.next().replace("?", "");
			System.out.println("Is the Person Indian?");
			boolean indian = sc.nextBoolean();

			// prepare byte[] representing photo file content
			InputStream is = new FileInputStream(photoPath);
			byte[] photoData = new byte[is.available()];
			photoData = is.readAllBytes();

			// prepare char[] representing biodata file content
			File file = new File(biodataPath);
			Reader reader = new FileReader(file);
			char bioDataContent[] = new char[(int) file.length()];
			reader.read(bioDataContent);

			MatrimonyEntity entity = new MatrimonyEntity(name, indian, addrs, photoData, photoData);

			String register = iMatrimoySer.register(entity);
			System.out.println(register);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
