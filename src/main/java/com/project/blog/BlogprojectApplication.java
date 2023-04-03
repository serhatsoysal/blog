package com.project.blog;

import com.project.blog.model.City;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BlogprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogprojectApplication.class, args);
	}

	@Bean
	CommandLineRunner run() {
		return args -> {

		};
	}
}
