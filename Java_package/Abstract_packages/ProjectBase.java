package Abstract_packages;

public abstract class ProjectBase {
    protected String projectName;
    protected double budget;

    public abstract void executeProject();

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }
}
