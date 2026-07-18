package collections_practice_and_dsa_practice.gcrcodebase.efficient_sorting_algorithm.normal_questions;
public class PatientRegistrationIdsMergeSort {

    public static void mergeSort(int[] patientIds, int left, int right) {

        if (left < right) {

            int mid = (left + right) / 2;

            mergeSort(patientIds, left, mid);
            mergeSort(patientIds, mid + 1, right);

            merge(patientIds, left, mid, right);
        }
    }

    public static void merge(int[] patientIds, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftArray[i] = patientIds[left + i];
        }

        for (int j = 0; j < n2; j++) {
            rightArray[j] = patientIds[mid + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while (i < n1 && j < n2) {

            if (leftArray[i] <= rightArray[j]) {
                patientIds[k] = leftArray[i];
                i++;
            } else {
                patientIds[k] = rightArray[j];
                j++;
            }

            k++;
        }

        while (i < n1) {
            patientIds[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            patientIds[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {

        int[] patientIds = {105, 101, 108, 102, 104};

        System.out.println("Before Sorting:");

        for (int id : patientIds) {
            System.out.print(id + " ");
        }

        mergeSort(patientIds, 0, patientIds.length - 1);

        System.out.println("\n\nAfter Sorting:");

        for (int id : patientIds) {
            System.out.print(id + " ");
        }
    }
}