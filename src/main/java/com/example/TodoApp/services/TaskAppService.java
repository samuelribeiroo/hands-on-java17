package com.example.TodoApp.services;

import com.example.TodoApp.models.TaskModel;
import com.example.TodoApp.repositories.TaskRepository;
import org.springframework.stereotype.Service;
import java.text.MessageFormat;
import java.util.*;

@Service
public class TaskAppService {
    private final TaskRepository taskRepository;

    public TaskAppService (TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<TaskModel> getAllTasks() {
        return taskRepository.findAll();
    }

    public void createNewTask(String title) {
        TaskModel task = new TaskModel();
        task.setTitle(title);

        taskRepository.save(task);

        List<TaskModel> tasks = taskRepository.findByTitle(title);

        if (!tasks.isEmpty()) {
            System.out.println(MessageFormat.format("Tarefa criada com sucesso: {0}", tasks.get(0)));
        }
    }
}
