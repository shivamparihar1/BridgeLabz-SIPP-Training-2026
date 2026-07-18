package collections_practice_and_dsa_practice.gcrcodebase.efficient_sorting_algorithm.scenario_LibrarySorting;

public class CountingSortGenres {

    void countingSort(int[] genres) {

        int[] count = new int[21];

        for (int genre : genres) {
            count[genre]++;
        }

        int index = 0;

        for (int i = 1; i <= 20; i++) {

            while (count[i] > 0) {
                genres[index++] = i;
                count[i]--;
            }
        }
    }
}