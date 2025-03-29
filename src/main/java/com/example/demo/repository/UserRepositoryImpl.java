package com.example.demo.repository;

import com.example.demo.model.Email;
import com.example.demo.model.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserRepositoryImpl implements UserRepository {
    private final Map<Integer, User> userData = new HashMap<>();

    public UserRepositoryImpl() {
        userData.put(1, new User(1, "John", Email.create("jdoe@me.com")));
        userData.put(2, new User(2, "Thomas", Email.create("thomas@me.com")));
    }

    @Override
    public User getUserById(Integer id) {
        return userData.get(id);
    }
}
