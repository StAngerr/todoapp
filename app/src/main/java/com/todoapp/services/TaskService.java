package com.todoapp.services;

import com.todoapp.models.Task;
import com.todoapp.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    @Autowired
    TaskRepository taskRepo;

    public Iterable<Task> getAllTasks() {
        return this.taskRepo.findAll();
    }

    public Task createTask(Task task) {
        return this.taskRepo.save(task);
    }
}
