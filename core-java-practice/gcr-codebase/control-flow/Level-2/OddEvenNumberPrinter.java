package corejava.gcrcodebase.controlflow.Level2;

import java.util.Scanner;

public class OddEvenNumberPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();

        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is Even");
                } else {
                    System.out.println(i + " is Odd");
                }
            }
        } else {
            System.out.println("The number " + number + " is not a natural number.");
        }

        scanner.close();
    }
}