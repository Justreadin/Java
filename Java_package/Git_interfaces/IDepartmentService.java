package Git_interfaces;

public interface IDepartmentService {
    void addDepartment(Department department);
    void removeDepartment(int departmentCode);
    Department getDepartment(int departmentCode);
}
