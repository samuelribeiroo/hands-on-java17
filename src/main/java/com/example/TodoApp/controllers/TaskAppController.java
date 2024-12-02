package com.example.TodoApp.controllers;

import com.example.TodoApp.models.TaskModel;
import com.example.TodoApp.services.TaskAppService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/tasks")
public class TaskAppController {
    private final TaskAppService taskAppService;

    public TaskAppController(TaskAppService taskAppService) {
        this.taskAppService = taskAppService;
    }

    @GetMapping
    public String getTasks(Model model) {
        List<TaskModel> tasks = taskAppService.getAllTasks();

        model.addAttribute("tasks", tasks);

        return "tasks";
    }

    @PostMapping("/create")
    public String createTask(@RequestParam String title) {
        taskAppService.createNewTask(title);
        return "redirect:/tasks";
    }

}
