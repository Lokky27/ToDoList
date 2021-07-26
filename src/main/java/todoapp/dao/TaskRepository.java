package todoapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import todoapp.models.Task;

public interface TaskRepository extends JpaRepository<Task, Long>
{

}
