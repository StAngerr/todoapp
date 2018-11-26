package com.todoapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.todoapp.models.Task;

public interface TaskRepository extends CrudRepository<Task, Integer> {
}