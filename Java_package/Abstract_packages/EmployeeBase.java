package Abstract_packages;

public abstract class EmployeeBase {
    protected String name;
    protected int employeeId;

    public abstract void performDuties();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
}
