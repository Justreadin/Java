package Git_interfaces;

public interface IProjectService {
    void addProject(Project project);
    void updateProjectBudget(int projectId, double budget);
    Project getProject(int projectId);
}
