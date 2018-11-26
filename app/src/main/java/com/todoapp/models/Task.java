package com.todoapp.models;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.OneToOne;
import javax.persistence.FetchType;
import javax.persistence.MapsId;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "TASKS")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "label_id")
    private Long labelId;

    @Column(name = "name")
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

//    public Label getLabel() {
//        return label;
//    }
//
//    public void setLabel(Label label) {
//        this.label = label;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}