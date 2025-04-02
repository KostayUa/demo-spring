package com.example.demo.repository;

import com.example.demo.model.User;
import com.example.demo.repository.mapper.UserRowMapper;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UserRepositoryImpl implements UserRepository {

    private final JdbcTemplate jdbcTemplate;
    private final UserRowMapper userRowMapper = new UserRowMapper();

    public UserRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void createUser(User user) {
        String insertSql = "INSERT INTO users (name, email) VALUES (?, ?)";
        jdbcTemplate.update(insertSql, user.getName(), user.getEmail().getValue());
    }

    @Override
    public Optional<User> getUserById(Long id) {
        String selectSql = "SELECT * FROM users WHERE id = ?";
        return jdbcTemplate.query(selectSql, userRowMapper, id).stream().findFirst();
    }

    @Override
    public List<User> getAllUsers() {
        String selectAllSql = "SELECT * FROM users";
        return jdbcTemplate.query(selectAllSql, userRowMapper);
    }

//    @Override
//    public void createUser(User user) {
//        String insertSql = "INSERT INTO users (name, email) VALUES (?, ?)";
//        jdbcTemplate.update(insertSql, user.getName(), user.getEmail());
//    }
//
//    @Override
//    public Optional<User> getUserById(Long id) {
//        String selectSql = "SELECT * FROM users WHERE id = ?";
//        return jdbcTemplate.query(selectSql, new BeanPropertyRowMapper<>(User.class), id).stream().findFirst();
//    }
//
//    @Override
//    public List<User> getAllUsers() {
//        String selectAllSql = "SELECT * FROM users";
//        return jdbcTemplate.query(selectAllSql, new BeanPropertyRowMapper<>(User.class));
//    }
}
