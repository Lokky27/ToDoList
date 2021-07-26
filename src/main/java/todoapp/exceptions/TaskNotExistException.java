package todoapp.exceptions;

public class TaskNotExistException extends Exception
{
    @Override
    public String getMessage()
    {
        return "Task not exist";
    }
}
