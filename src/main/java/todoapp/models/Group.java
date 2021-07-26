package todoapp.models;

import lombok.Data;

import java.util.List;

@Data
public class Group
{

    private long id;
    private String name;
    private List<Task> taskList;

}
