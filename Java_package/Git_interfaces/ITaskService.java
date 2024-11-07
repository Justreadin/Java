package Git_interfaces;

public interface ITaskService {
    void addTask(Task task);
    void updateTask(int taskId, String description);
    Task getTask(int taskId);
}
