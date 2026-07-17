package oops_practice.gcrcodebase.oops_fundamental.static_final_instanceOf_keywords;
public class EmployeeManagementSystem {

    static String companyName = "Tech Solutions Pvt Ltd";
    static int totalEmployees = 0;

    final int id;
    String name;
    String designation;

    EmployeeManagementSystem(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    void displayDetails() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Designation: " + designation);
    }

    public static void main(String[] args) {

        EmployeeManagementSystem employee1 =
                new EmployeeManagementSystem(
                        "Shivam",
                        101,
                        "Software Developer"
                );

        EmployeeManagementSystem employee2 =
                new EmployeeManagementSystem(
                        "Rahul",
                        102,
                        "Data Analyst"
                );

        if (employee1 instanceof EmployeeManagementSystem) {
            employee1.displayDetails();
        }

        System.out.println();

        if (employee2 instanceof EmployeeManagementSystem) {
            employee2.displayDetails();
        }

        System.out.println();

        EmployeeManagementSystem.displayTotalEmployees();
    }
}