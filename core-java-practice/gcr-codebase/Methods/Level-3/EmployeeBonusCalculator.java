package corejava.gcrcodebase.methods.level3;

public class EmployeeBonusCalculator {

    public static double[][] generateEmployeeData() {

        double[][] employees = new double[10][2];

        for (int i = 0; i < employees.length; i++) {

            employees[i][0] = (int) (Math.random() * 90000) + 10000;
            employees[i][1] = (int) (Math.random() * 11) + 1;
        }

        return employees;
    }

    public static double[][] calculateBonusAndNewSalary(double[][] employees) {

        double[][] result = new double[10][4];

        for (int i = 0; i < employees.length; i++) {

            double oldSalary = employees[i][0];
            double yearsOfService = employees[i][1];

            double bonus;

            if (yearsOfService > 5) {
                bonus = oldSalary * 0.05;
            } else {
                bonus = oldSalary * 0.02;
            }

            double newSalary = oldSalary + bonus;

            result[i][0] = oldSalary;
            result[i][1] = yearsOfService;
            result[i][2] = bonus;
            result[i][3] = newSalary;
        }

        return result;
    }

    public static void displayReport(double[][] data) {

        double totalOldSalary = 0;
        double totalBonus = 0;
        double totalNewSalary = 0;

        System.out.println("Emp\tOld Salary\tYears\tBonus\t\tNew Salary");

        for (int i = 0; i < data.length; i++) {

            System.out.printf("%d\t%.2f\t%.0f\t%.2f\t%.2f%n",
                    (i + 1),
                    data[i][0],
                    data[i][1],
                    data[i][2],
                    data[i][3]);

            totalOldSalary += data[i][0];
            totalBonus += data[i][2];
            totalNewSalary += data[i][3];
        }

        System.out.println("\n---------------------------------------------");

        System.out.printf("Total Old Salary : %.2f%n", totalOldSalary);
        System.out.printf("Total Bonus      : %.2f%n", totalBonus);
        System.out.printf("Total New Salary : %.2f%n", totalNewSalary);
    }

    public static void main(String[] args) {

        double[][] employees = generateEmployeeData();

        double[][] report = calculateBonusAndNewSalary(employees);

        displayReport(report);
    }
}