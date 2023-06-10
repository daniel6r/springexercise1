package com.example.springexercise1;

import com.example.springexercise1.model.Solution;
import com.example.springexercise1.model.User;
import com.example.springexercise1.service.TaskService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringExerciseApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringExerciseApplication.class, args);

		TaskService taskService = (TaskService) context.getBean("taskService");

		User user1 = new User(1, "Jacob", true);
		User user2 = new User(2, "Mark", false);

		Solution solution1 = new Solution(1, "answer A");
		Solution solution2 = new Solution(2, "answer C");

		taskService.saveSolution(solution1, user1);
		taskService.saveSolution(solution2, user2);

	}

}
