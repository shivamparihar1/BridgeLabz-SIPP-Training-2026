package collections_practice_and_dsa_practice.gcrcodebase.efficient_sorting_algorithm.scenario_LibrarySorting;

public class MergeSortBooks {

    void mergeSort(int[] books, int left, int right) {

        if (left < right) {

            int mid = (left + right) / 2;

            mergeSort(books, left, mid);
            mergeSort(books, mid + 1, right);

            merge(books, left, mid, right);
        }
    }

    void merge(int[] books, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftArray[i] = books[left + i];
        }

        for (int j = 0; j < n2; j++) {
            rightArray[j] = books[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {

            if (leftArray[i] <= rightArray[j]) {
                books[k++] = leftArray[i++];
            } else {
                books[k++] = rightArray[j++];
            }
        }

        while (i < n1) {
            books[k++] = leftArray[i++];
        }

        while (j < n2) {
            books[k++] = rightArray[j++];
        }
    }
}