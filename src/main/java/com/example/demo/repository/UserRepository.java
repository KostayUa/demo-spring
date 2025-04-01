package com.example.demo.repository;

import com.example.demo.model.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {

    void createUser(User user);

    Optional<User> getUserById(Long id);

    List<User> getAllUsers();
}
