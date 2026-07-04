package corejava.gcrcodebase.exception_handling.exception_handling_scenario_problem.hospital_billing;


import java.util.Scanner;
import java.util.InputMismatchException;

public class HospitalBillingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter number of patients: ");
            int n = sc.nextInt();

            int[] bills = new int[n];

            System.out.println("Enter bill amounts:");
            for (int i = 0; i < n; i++) {
                bills[i] = sc.nextInt();
            }

            System.out.print("Enter patient index: ");
            int index = sc.nextInt();

            System.out.print("Enter number of items: ");
            int items = sc.nextInt();

            System.out.print("Enter payment amount: ");
            int payment = sc.nextInt();

            int billPerItem = bills[index] / items;

            if (payment < billPerItem) {
                throw new InsufficientFundsException("Payment failed: Insufficient funds");
            }

            System.out.println("Billing successful. Bill per item = " + billPerItem);

        } catch (ArithmeticException e) {
            System.out.println("Error: Items cannot be zero");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid patient index");

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter numeric values only");

        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());

        }

        sc.close();
    }
}