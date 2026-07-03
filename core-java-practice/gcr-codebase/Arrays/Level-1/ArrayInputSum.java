package corejava.gcrcodebase.arrays.level1;

import java.util.Scanner;

public class ArrayInputSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] arr = new double[10];
        double total = 0.0;
        int index = 0;

        System.out.println("Enter numbers (max 10). Enter 0 or negative number to stop:");

        while (true) {

            double num = sc.nextDouble();

            // Stop condition
            if (num <= 0) {
                break;
            }

            // Stop if array is full
            if (index == 10) {
                break;
            }

            arr[index] = num;
            index++;
        }

        // Display numbers and calculate sum
        System.out.println("\nNumbers entered:");

        for (int i = 0; i < index; i++) {
            System.out.println(arr[i]);
            total += arr[i];
        }

        System.out.println("\nTotal Sum = " + total);

        sc.close();
    }
}