package com.mindhub.todolist.Controllers;

import com.mindhub.todolist.DTOS.UserDTO;
import com.mindhub.todolist.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/userEntity")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<UserDTO> getAll(){
        return userRepository.findAll().stream().map(UserDTO::new).toList();
    }
}
