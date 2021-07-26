package controllers;

import models.Storage;
import models.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskController
{
    @GetMapping("/tasks/")
    public List<Task> tasks()
    {
        return Storage.getTasks();
    }

    @PostMapping("/tasks/")
    public long add(Task task)
    {
        return Storage.addTask(task);
    }
}
