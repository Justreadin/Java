package Git_packages;

public class Task {
    private String taskDescription;
    private int taskId;

    public Task(String taskDescription, int taskId) {
        this.taskDescription = taskDescription;
        this.taskId = taskId;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }
}
