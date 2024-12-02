package com.example.TodoApp.repositories;

import com.example.TodoApp.models.TaskModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<TaskModel, Long> {}
