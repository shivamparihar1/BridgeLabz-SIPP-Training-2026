package collections_practice_and_dsa_practice.gcrcodebase.sorting_algorithms;

public class EmployeeIdsInsertionSort {

    public static void main(String[] args) {

        int[] employeeIds = {105, 102, 108, 101, 104, 103};

        System.out.println("Before Sorting:");

        for (int id : employeeIds) {
            System.out.print(id + " ");
        }

        for (int i = 1; i < employeeIds.length; i++) {

            int key = employeeIds[i];
            int j = i - 1;

            while (j >= 0 && employeeIds[j] > key) {

                employeeIds[j + 1] = employeeIds[j];
                j--;
            }

            employeeIds[j + 1] = key;
        }

        System.out.println("\n\nAfter Sorting:");

        for (int id : employeeIds) {
            System.out.print(id + " ");
        }
    }
}