package corejava.gcrcodebase.recursion.recursion_scenario_problem;

import java.util.Scanner;

public class EmployeeSkillAssignment {

    public static void findTeams(int[] arr, int index, int target, int[] temp, int tempIndex) {

        if (target == 0) {
            for (int i = 0; i < tempIndex; i++) {
                System.out.print(temp[i] + " ");
            }
            System.out.println();
            return;
        }

        if (index == arr.length || target < 0) {
            return;
        }

        temp[tempIndex] = arr[index];
        findTeams(arr, index + 1, target - arr[index], temp, tempIndex + 1);

        findTeams(arr, index + 1, target, temp, tempIndex);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter skill scores:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target skill sum: ");
        int target = sc.nextInt();

        int[] temp = new int[n];

        System.out.println("Possible teams:");

        findTeams(arr, 0, target, temp, 0);

        sc.close();
    }
}