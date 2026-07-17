package corejava.gcrcodebase.arrays.level1;
import java.util.Scanner;

public class MultiplicationTable6To9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Array to store results from 6 to 9 (4 values)
        int[] multiplicationResult = new int[4];

        // Store results in array (6 to 9)
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i;
        }

        // Display results
        System.out.println("\nMultiplication Table of " + number + " (6 to 9):");

        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
        }

        sc.close();
    }
}