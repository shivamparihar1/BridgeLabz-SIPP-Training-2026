package corejava.gcrcodebase.methods.level2;
import java.util.Scanner;

public class SumOfNaturalNumbersRecursion {

    public static int findSumUsingRecursion(int n) {
        if (n == 1) {
            return 1;
        }

        return n + findSumUsingRecursion(n - 1);
    }

    public static int findSumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a natural number.");
            return;
        }

        int recursionSum = findSumUsingRecursion(n);
        int formulaSum = findSumUsingFormula(n);

        System.out.println("Sum using Recursion = " + recursionSum);
        System.out.println("Sum using Formula = " + formulaSum);

        if (recursionSum == formulaSum) {
            System.out.println("Both results are correct and equal.");
        } else {
            System.out.println("Results are not equal.");
        }

        sc.close();
    }
}