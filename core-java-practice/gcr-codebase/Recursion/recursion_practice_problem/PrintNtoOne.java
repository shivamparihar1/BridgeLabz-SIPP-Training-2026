package corejava.gcrcodebase.recursion.recursion_practice_problem;

import java.util.Scanner;

public class PrintNtoOne {

    public static void printNumbers(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        printNumbers(n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of N: ");
        int n = sc.nextInt();

        printNumbers(n);

        sc.close();
    }
}