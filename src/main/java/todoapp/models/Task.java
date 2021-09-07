package todoapp.models;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "tasks")
public class Task
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "task_id")
    private Long id;

    private String title;
    private String comment;

    @ManyToOne
    @JoinColumn(name = "group_id")
    private Group group;
    private boolean isDone;
    private LocalDate date;

}
