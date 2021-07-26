package models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Data
public class Task
{
    private long id;
    private String name;
    private boolean isDone;
    private String mark;
    private Priority priority;
    private LocalDate date;
    private Group group;
}
