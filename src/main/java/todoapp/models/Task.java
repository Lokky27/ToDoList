package todoapp.models;

import lombok.Data;

@Data
public class Task
{
    private long id;
    private String name;
    private boolean isDone;
    private String comment;
    private Priority priority;
    private Group group;
}
