package todoapp.dao;

import org.springframework.stereotype.Component;
import todoapp.models.Task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;

@Component
public class TaskStack
{
    private static AtomicLong currentId = new AtomicLong(1);
    private static HashMap<Long, Task> tasks = new HashMap<>();

    public static ArrayList<Task> getAllTasks()
    {
        return new ArrayList<>(tasks.values());
    }

    public static Task getTask(long id)
    {
        if (tasks.containsKey(id))
        {
            return tasks.get(id);
        }
        return null;
    }

    public static long addTask(Task task)
    {
        long id = currentId.incrementAndGet();
        task.setId(id);
        tasks.put(id, task);
        return id;
    }

    public static void delete(long id)
    {

    }
}
