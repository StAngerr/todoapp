package com.todoapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.validation.Valid;

import com.todoapp.LabelRepository;
import com.todoapp.Label;

@RestController
public class LabelController {
    @Autowired
    private LabelRepository labelRepo;

    @GetMapping(value = "/labels")
    public @ResponseBody Iterable<Label> label() {
        return labelRepo.findAll();
    }

    @PostMapping(path = "/labels", consumes = "application/json", produces = "application/json")
    public Label addLabel(@Valid @RequestBody Label label) {
        return labelRepo.save(label);
    }
}