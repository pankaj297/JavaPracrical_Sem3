package com.demo1.controller;


import org.springframework.web.bind.annotation.*;

import com.demo1.model.User;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    // Static list of users (no database)
    private List<User> users = Arrays.asList(
            new User(1, "Pankaj Naik", "pankaj@example.com"),
            new User(2, "Rohit Sharma", "rohit@example.com"),
            new User(3, "Virat Kohli", "virat@example.com")
    );

    // GET - Return all users
    @GetMapping
    public List<User> getAllUsers() {
        return users;
    }

    // GET - Return user by ID
    @GetMapping("/{id}")
    public User getUserById(@PathVariable int id) {
        return users.stream()
                .filter(user -> user.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
