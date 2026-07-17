package corejava.gcrcodebase.arrays.level2;
import java.util.Scanner;

public class ZaraEmployeeBonus {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] salary = new double[10];
        double[] years = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        for (int i = 0; i < 10; i++) {

            System.out.print("Enter salary of employee " + (i + 1) + ": ");
            double s = sc.nextDouble();

            System.out.print("Enter years of service of employee " + (i + 1) + ": ");
            double y = sc.nextDouble();

            if (s <= 0 || y < 0) {
                System.out.println("Invalid input, enter again");
                i--;
                continue;
            }

            salary[i] = s;
            years[i] = y;
        }

        for (int i = 0; i < 10; i++) {

            double b;

            if (years[i] > 5) {
                b = salary[i] * 0.05;
            } else {
                b = salary[i] * 0.02;
            }

            bonus[i] = b;
            newSalary[i] = salary[i] + b;

            totalBonus += b;
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println(totalBonus);
        System.out.println(totalOldSalary);
        System.out.println(totalNewSalary);

        sc.close();
    }
}