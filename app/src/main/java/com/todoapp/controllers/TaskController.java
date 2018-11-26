package com.todoapp.controllers;

import com.todoapp.services.TaskService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.validation.Valid;

import com.todoapp.models.Task;

@RestController
public class TaskController {
    @Autowired
    private TaskService taskService;

    @GetMapping(value = "/tasks")
    public @ResponseBody Iterable<Task> task() {
        return taskService.getAllTasks();
    }

    @PostMapping(path = "/tasks", consumes = "application/json", produces = "application/json")
    public Task addTask(@Valid @RequestBody Task task) {
        return taskService.createTask(task);
    }
}