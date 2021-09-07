package todoapp.repository;

import org.springframework.data.repository.CrudRepository;
import todoapp.models.Task;

public interface TaskRepository extends CrudRepository<Task, Long>
{

}
