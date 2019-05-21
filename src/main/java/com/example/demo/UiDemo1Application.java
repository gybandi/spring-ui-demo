package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class UiDemo1Application implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(UiDemo1Application.class, args);
	}

}
