package com.example.springexercise1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringExerciseApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringExerciseApplication.class, args);
	}

}
