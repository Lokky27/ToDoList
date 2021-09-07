package todoapp.models;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Group
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "group_id")
    private long id;

    @Column(name = "title")
    private String title;

    @OneToMany
    private List<Task> taskList;

}
