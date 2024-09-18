package com.mindhub.todolist.Repositories;

import com.mindhub.todolist.Models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
