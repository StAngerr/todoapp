package com.todoapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.validation.Valid;

import com.todoapp.TaskRepository;
import com.todoapp.Task;

@RestController
public class TaskController {
    @Autowired
    private TaskRepository taskRepo;

    @GetMapping(value = "/tasks")
    public @ResponseBody Iterable<Task> task() {
        return taskRepo.findAll();
    }

    @PostMapping(path = "/tasks", consumes = "application/json", produces = "application/json")
    public Task addTask(@Valid @RequestBody Task task) {
        return taskRepo.save(task);
    }
}