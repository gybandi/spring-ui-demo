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
		User user = new User();
		user.setUtype(UserType.SUPPLIER);
		userRepository.save(user);

		User user2 = new User();
		user2.setUtype(UserType.ADMIN);
		userRepository.save(user2);

		User user3 = new User();
		user3.setUtype(UserType.CLIENT);
		userRepository.save(user3);
	}

}
