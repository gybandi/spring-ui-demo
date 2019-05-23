package com.example.demo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InitializerService {

	@Autowired
	private UserRepository userRepository;

	@PostConstruct
	public void init() {

		User user2 = new User();
		user2.setUtype(UserType.ADMIN);
		user2.setName("Admin Bob");
		userRepository.save(user2);
	}

}
