package Collection_practice.departmapping;

import java.util.*;

public class EmployeeMain {
    public static void main(String[] args) {

        Department departmentOne = new Department(DepartmentType.IT);
        Department departmentTwo = new Department(DepartmentType.TESTING);
        Department departmentThree = new Department(DepartmentType.DEV);

        Employee employee1 = new Employee(1, "Sahil", 20000.0, departmentOne);
        Employee employee2 = new Employee(2, "Sahi", 20000.0, departmentTwo);
        Employee employee3 = new Employee(3, "Sahl", 20000.0, departmentThree);
        Employee employee4 = new Employee(4, "Sail", 20000.0, departmentOne);
        Employee employee5 = new Employee(5, "Shil", 20000.0, departmentTwo);

        ArrayList<Employee> list = new ArrayList<>();
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        list.add(employee4);
        list.add(employee5);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter department (IT / TESTING / DEV):");
        String dept = sc.nextLine().toUpperCase();

        DepartmentType type = DepartmentType.valueOf(dept);

        System.out.println("\nEmployees in " + type + " department:");

        for (Employee e : list) {
            if (e.getDepartment().getDepartmentType() == type) {
                System.out.println(e);
            }
        }
    }
}