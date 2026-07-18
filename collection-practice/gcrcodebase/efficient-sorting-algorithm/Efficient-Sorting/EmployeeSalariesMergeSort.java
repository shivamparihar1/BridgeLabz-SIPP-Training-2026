package collections_practice_and_dsa_practice.gcrcodebase.efficient_sorting_algorithm.normal_questions;

public class EmployeeSalariesMergeSort {

    public static void mergeSort(int[] salaries, int left, int right) {

        if (left < right) {

            int mid = (left + right) / 2;

            mergeSort(salaries, left, mid);
            mergeSort(salaries, mid + 1, right);

            merge(salaries, left, mid, right);
        }
    }

    public static void merge(int[] salaries, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftArray[i] = salaries[left + i];
        }

        for (int j = 0; j < n2; j++) {
            rightArray[j] = salaries[mid + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while (i < n1 && j < n2) {

            if (leftArray[i] <= rightArray[j]) {
                salaries[k] = leftArray[i];
                i++;
            } else {
                salaries[k] = rightArray[j];
                j++;
            }

            k++;
        }

        while (i < n1) {
            salaries[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            salaries[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {

        int[] salaries = {45000, 32000, 78000, 55000, 40000, 60000};

        System.out.println("Before Sorting:");

        for (int salary : salaries) {
            System.out.print(salary + " ");
        }

        mergeSort(salaries, 0, salaries.length - 1);

        System.out.println("\n\nAfter Sorting:");

        for (int salary : salaries) {
            System.out.print(salary + " ");
        }
    }
}