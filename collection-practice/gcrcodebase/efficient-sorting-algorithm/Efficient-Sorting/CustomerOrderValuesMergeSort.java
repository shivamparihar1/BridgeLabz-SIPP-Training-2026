package collections_practice_and_dsa_practice.gcrcodebase.efficient_sorting_algorithm.normal_questions;
public class CustomerOrderValuesMergeSort {

    public static void mergeSort(int[] orderValues, int left, int right) {

        if (left < right) {

            int mid = (left + right) / 2;

            mergeSort(orderValues, left, mid);
            mergeSort(orderValues, mid + 1, right);

            merge(orderValues, left, mid, right);
        }
    }

    public static void merge(int[] orderValues, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftArray[i] = orderValues[left + i];
        }

        for (int j = 0; j < n2; j++) {
            rightArray[j] = orderValues[mid + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while (i < n1 && j < n2) {

            if (leftArray[i] <= rightArray[j]) {
                orderValues[k] = leftArray[i];
                i++;
            } else {
                orderValues[k] = rightArray[j];
                j++;
            }

            k++;
        }

        while (i < n1) {
            orderValues[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            orderValues[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {

        int[] orderValues = {850, 420, 1200, 650, 300};

        System.out.println("Before Sorting:");

        for (int value : orderValues) {
            System.out.print(value + " ");
        }

        mergeSort(orderValues, 0, orderValues.length - 1);

        System.out.println("\n\nAfter Sorting:");

        for (int value : orderValues) {
            System.out.print(value + " ");
        }
    }
}