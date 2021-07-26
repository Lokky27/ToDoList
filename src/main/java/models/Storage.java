package models;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Storage
{
    private static ArrayList<Task> tasks = new ArrayList<>();

    public static ArrayList<Task> getTasks()
    {
        return tasks;
    }
    public static long addTask(Task task)
    {
        long id = tasks.size() + 1;
        task.setId(id);
        tasks.add(task);
        return id;
    }
}
