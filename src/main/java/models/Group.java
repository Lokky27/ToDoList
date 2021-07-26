package models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Data
public class Group
{

    private long id;
    private String name;

    private List<Task> taskList;

}
