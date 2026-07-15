package Collection_practice.departmapping;

public class Department {
    private DepartmentType departmentType;

    public Department(DepartmentType departmentType) {
        this.departmentType = departmentType;
    }

    public DepartmentType getDepartmentType() {
        return departmentType;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentType=" + departmentType +
                '}';
    }
}