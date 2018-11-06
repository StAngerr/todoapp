package com.todoapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.validation.Valid;

import com.todoapp.UserRepository;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "/users")
    public @ResponseBody Iterable<User> user() {
        return userRepository.findAll();
    }

    @PostMapping(path = "/users", consumes = "application/json", produces = "application/json")
    public User addUser(@Valid @RequestBody User user) {
        return userRepository.save(user);
    }
}