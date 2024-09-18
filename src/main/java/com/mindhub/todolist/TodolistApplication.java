package com.mindhub.todolist;

import com.mindhub.todolist.Models.Task;
import com.mindhub.todolist.Models.TaskStatus;
import com.mindhub.todolist.Models.UserEntity;
import com.mindhub.todolist.Repositories.TaskRepository;
import com.mindhub.todolist.Repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.swing.plaf.PanelUI;

@SpringBootApplication
public class TodolistApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodolistApplication.class, args);
	}

	@Bean
	public CommandLineRunner initData(TaskRepository taskRepository, UserRepository userRepository) {
		return args -> {
			UserEntity userEntity = new UserEntity("Edu","1234","edu@mindhub.com");
			userRepository.save(userEntity);
			Task task = new Task("new task","tast test description", TaskStatus.PENDING);
			userEntity.addTask(task);
			taskRepository.save(task);
	};
	}
}
