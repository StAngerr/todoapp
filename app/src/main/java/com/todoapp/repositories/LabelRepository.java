package com.todoapp;

import org.springframework.data.repository.CrudRepository;

import com.todoapp.Label;

public interface LabelRepository extends CrudRepository<Label, Integer> {
}