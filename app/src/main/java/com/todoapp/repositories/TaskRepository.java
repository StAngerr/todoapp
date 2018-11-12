package com.todoapp;

import org.springframework.data.repository.CrudRepository;

import com.todoapp.Task;

public interface TaskRepository extends CrudRepository<Task, Integer> {
}