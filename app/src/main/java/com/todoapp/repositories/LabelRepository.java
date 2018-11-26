package com.todoapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.todoapp.models.Label;

public interface LabelRepository extends CrudRepository<Label, Integer> {
}