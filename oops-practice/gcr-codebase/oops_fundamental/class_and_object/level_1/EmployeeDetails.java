package oops_practice.gcrcodebase.oops_fundamental.class_and_object.level_1;

public class EmployeeDetails {

    String name;
    int id;
    double salary;

    EmployeeDetails(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Employee Details");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {

        EmployeeDetails employee = new EmployeeDetails("Shivam", 101, 50000);

        employee.displayDetails();
    }
}