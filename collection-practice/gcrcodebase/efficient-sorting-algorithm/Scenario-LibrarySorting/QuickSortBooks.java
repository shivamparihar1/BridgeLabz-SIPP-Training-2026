package collections_practice_and_dsa_practice.gcrcodebase.efficient_sorting_algorithm.scenario_LibrarySorting;

public class QuickSortBooks {

    void quickSort(int[] books, int low, int high) {

        if (low < high) {

            int pivot = partition(books, low, high);

            quickSort(books, low, pivot - 1);
            quickSort(books, pivot + 1, high);
        }
    }

    int partition(int[] books, int low, int high) {

        int pivot = books[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (books[j] <= pivot) {

                i++;

                int temp = books[i];
                books[i] = books[j];
                books[j] = temp;
            }
        }

        int temp = books[i + 1];
        books[i + 1] = books[high];
        books[high] = temp;

        return i + 1;
    }
}