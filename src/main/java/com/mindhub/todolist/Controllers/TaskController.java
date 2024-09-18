package com.mindhub.todolist.Controllers;

import com.mindhub.todolist.Repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/api/task/{id}")
public class TaskController {
    @Autowired
    private TaskRepository taskRepository;

    @GetMapping
    public String getTaskById(@PathVariable("id") Long id){
        return "Task ID" + id;
    }

}

