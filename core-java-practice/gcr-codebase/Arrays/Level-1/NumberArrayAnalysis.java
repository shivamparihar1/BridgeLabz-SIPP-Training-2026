package corejava.gcrcodebase.arrays.level1;
import java.util.Scanner;

public class NumberArrayAnalysis {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        // Input 5 numbers
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("\nNumber Analysis:");

        // Check each number
        for (int i = 0; i < arr.length; i++) {

            int num = arr[i];

            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println(num + " is Positive and Even");
                } else {
                    System.out.println(num + " is Positive and Odd");
                }
            }
            else if (num < 0) {
                System.out.println(num + " is Negative");
            }
            else {
                System.out.println(num + " is Zero");
            }
        }

        // Compare first and last element
        int first = arr[0];
        int last = arr[arr.length - 1];

        System.out.println("\nFirst and Last Element Comparison:");

        if (first == last) {
            System.out.println("First and Last elements are Equal");
        }
        else if (first > last) {
            System.out.println("First element is Greater than Last element");
        }
        else {
            System.out.println("First element is Less than Last element");
        }

        sc.close();
    }
}