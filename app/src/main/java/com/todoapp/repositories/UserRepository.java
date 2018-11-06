package com.todoapp;

import org.springframework.data.repository.CrudRepository;

import com.todoapp.User;

public interface UserRepository extends CrudRepository<User, Integer> {
}