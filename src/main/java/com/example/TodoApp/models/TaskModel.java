package com.example.TodoApp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "task-table")
public class TaskModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    public String title;

    public void setTitle(String title) {
        this.title = title;
    }
}
