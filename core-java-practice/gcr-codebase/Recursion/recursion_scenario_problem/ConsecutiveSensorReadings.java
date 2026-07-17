package corejava.gcrcodebase.recursion.recursion_scenario_problem;
import java.util.Scanner;

public class ConsecutiveSensorReadings {

    public static boolean isIncreasing(int[] arr, int index) {

        if (index == arr.length - 1) {
            return true;
        }

        if (arr[index] >= arr[index + 1]) {
            return false;
        }

        return isIncreasing(arr, index + 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of readings: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter readings:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean result = isIncreasing(arr, 0);

        System.out.println(result);

        sc.close();
    }
}