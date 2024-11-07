package Git_interfaces;

public interface IEmployeeService {
    void addEmployee(Employee employee);
    void removeEmployee(int employeeId);
    Employee getEmployee(int employeeId);
}
