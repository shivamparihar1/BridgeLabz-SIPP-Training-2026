package oops_practice.gcrcodebase.encapsulation_and_abstraction.payrollsystem;

public class Main {

    public static void main(String[] args) {

        FullTimeEmployee fullTimeEmployee =
                new FullTimeEmployee(101, "Shivam", 50000);

        PartTimeEmployee partTimeEmployee =
                new PartTimeEmployee(102, "Rahul", 80, 500);

        System.out.println("Full Time Employee");
        fullTimeEmployee.displayEmployeeInfo();

        System.out.println();

        System.out.println("Part Time Employee");
        partTimeEmployee.displayEmployeeInfo();
    }
}