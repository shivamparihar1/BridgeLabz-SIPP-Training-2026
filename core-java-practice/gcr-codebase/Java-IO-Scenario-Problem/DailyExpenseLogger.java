package corejava.gcrcodebase.java_io_scenario_problem;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DailyExpenseLogger {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter expense category: ");
            String category = sc.nextLine();

            System.out.print("Enter expense amount: ");
            int amount = sc.nextInt();

            FileWriter fw = new FileWriter("expenses.txt", true);

            fw.write(category + " - " + amount + "\n");

            fw.close();

            System.out.println("Expense saved successfully!");

        } catch (IOException e) {

            System.out.println("Error writing to file");
        }

        sc.close();
    }
}