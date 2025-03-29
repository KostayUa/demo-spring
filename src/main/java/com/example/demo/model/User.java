package com.example.demo.model;

import java.util.Objects;

public class User {
    private final Integer id;
    private final String name;
    private final Email email;

    public User(int id, String name, Email email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Email getEmail() {
        return email;
    }



//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        User user = (User) o;
//        return Objects.equals(id, user.id) && Objects.equals(name, user.name) && Objects.equals(email, user.email);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name, email);
//    }

    @Override
    public String toString() {
        return "User(" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", email=" + email +
            ')';
    }
}
