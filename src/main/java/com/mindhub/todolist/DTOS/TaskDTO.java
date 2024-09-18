package com.mindhub.todolist.DTOS;

import com.mindhub.todolist.Models.Task;
import com.mindhub.todolist.Models.TaskStatus;

public class TaskDTO {
    private Long id;

    private String title;

    private String description;

    private TaskStatus status;

    public TaskDTO(){

    };
    public TaskDTO(Task task){
        id = task.getId();
        title = task.getTitle();
        description = task.getDescription();
        status = task.getStatus();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public TaskStatus getStatus() {
        return status;
    }
}
