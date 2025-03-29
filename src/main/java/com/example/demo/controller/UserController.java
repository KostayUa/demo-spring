package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

//    @GetMapping("/users/{id}")
//    public String getNameById(@PathVariable Integer id) {
//        return userService.getNameById(id);
//    }

    //TODO: maybe should be return Option<User>
    @GetMapping("/users/{id}")
    public User getNameById(@PathVariable Integer id) {
        return userService.getUserById(id);
    }
}
