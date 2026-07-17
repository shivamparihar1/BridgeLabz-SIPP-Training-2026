package corejava.gcrcodebase.exception_handling.exception_handling_scenario_problem.bank_atm;



import java.util.Scanner;
import java.util.InputMismatchException;

public class ATMSystem {

    public static void withdraw(int balance, int amount)
            throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException(balance, amount);
        }

        System.out.println("Withdrawal successful. Remaining balance: " + (balance - amount));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter current balance: ");
            int balance = sc.nextInt();

            System.out.print("Enter withdrawal amount: ");
            int amount = sc.nextInt();

            withdraw(balance, amount);

        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid numeric input");
        }

        sc.close();
    }
}