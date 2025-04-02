package com.example.demo.repository.mapper;

import com.example.demo.model.Email;
import com.example.demo.model.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper<User> {

    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new User(
            rs.getLong("id"),
            rs.getString("name"),
            Email.create(rs.getString("email"))
        );
    }
}
