package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

//    public String getNameById(Integer id) {
//        return "name" + id;
//    }

    //TODO: maybe should be return Option<User>
    public User getUserById(Integer id) {
        return userRepository.getUserById(id);
    }
}
