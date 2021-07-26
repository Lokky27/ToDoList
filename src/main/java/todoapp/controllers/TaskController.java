package todoapp.controllers;

import org.springframework.web.bind.annotation.*;
import todoapp.dao.TaskStack;

@RestController
public class TaskController
{
    private final TaskStack taskStack;

    public TaskController(TaskStack taskStack)
    {
        this.taskStack = taskStack;
    }


}
