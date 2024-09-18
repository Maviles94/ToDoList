package com.mindhub.todolist.DTOS;

import com.mindhub.todolist.Models.Task;
import com.mindhub.todolist.Models.UserEntity;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UserDTO {
    private Long id;

    private String username;

    private String email;

    private List<TaskDTO> tasks;

    public UserDTO(){

    };

    public UserDTO(UserEntity user){
        id = user.getId();
        username = user.getUsername();
        email = user.getEmail();
        tasks = user
                .getTasks()
                .stream()
                .map(task -> new TaskDTO(task)).collect(Collectors.toList());
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public List<TaskDTO> getTasks() {
        return tasks;
    }
}
