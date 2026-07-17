package corejava.gcrcodebase.exception_handling.exception_handling_practice_problem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionExceptionHandling {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            int result = a / b;

            System.out.println("Result = " + result);

        } catch (ArithmeticException e) {

            System.out.println("Cannot divide by zero");

        } catch (InputMismatchException e) {

            System.out.println("Invalid input: Please enter numeric values only");

        }

        sc.close();
    }
}