package collections_practice_and_dsa_practice.gcrcodebase.efficient_sorting_algorithm.scenario_LibrarySorting;

import java.util.Arrays;
import java.util.Random;

public class LibrarySortingComparison {

    public static void main(String[] args) {

        int[] sizes = {100, 1000, 10000};

        for (int size : sizes) {

            int[] original = new int[size];
            Random random = new Random();

            for (int i = 0; i < size; i++) {
                original[i] = random.nextInt(2026);
            }

            int[] mergeArray = Arrays.copyOf(original, size);
            int[] quickArray = Arrays.copyOf(original, size);

            int[] genreArray = new int[size];

            for (int i = 0; i < size; i++) {
                genreArray[i] = random.nextInt(20) + 1;
            }

            MergeSortBooks mergeSort = new MergeSortBooks();
            QuickSortBooks quickSort = new QuickSortBooks();
            CountingSortGenres countingSort = new CountingSortGenres();

            long start = System.nanoTime();
            mergeSort.mergeSort(mergeArray, 0, mergeArray.length - 1);
            long mergeTime = System.nanoTime() - start;

            start = System.nanoTime();
            quickSort.quickSort(quickArray, 0, quickArray.length - 1);
            long quickTime = System.nanoTime() - start;

            start = System.nanoTime();
            countingSort.countingSort(genreArray);
            long countingTime = System.nanoTime() - start;

            System.out.println("\nSize : " + size);
            System.out.println("Merge Sort Time    : " + mergeTime + " ns");
            System.out.println("Quick Sort Time    : " + quickTime + " ns");
            System.out.println("Counting Sort Time : " + countingTime + " ns");
        }
    }
}