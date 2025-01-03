package com.ganesh.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ganesh.app.entity.Profile;
import com.ganesh.app.entity.User;
import com.ganesh.app.service.IUserService;

@Component
public class MyRunner implements CommandLineRunner {
	@Autowired
	private IUserService userService;

	@Override
	public void run(String... args) throws Exception {
		try {
			// Create Profile
			Profile profile = new Profile();
			profile.setName("John Doe");

			// Create User and associate Profile
			User user = new User();
			user.setBio("Aspiring Developer");
			user.setProfile(profile); // Link profile to user

			// Save the User (profile will be saved automatically)
			String saveUser = userService.saveUser(user);
			System.out.println(saveUser);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
