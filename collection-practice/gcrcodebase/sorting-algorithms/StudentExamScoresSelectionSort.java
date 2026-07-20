package collections_practice_and_dsa_practice.gcrcodebase.sorting_algorithms;

public class StudentExamScoresSelectionSort {

    public static void main(String[] args) {

        int[] scores = {85, 72, 95, 60, 88, 75};

        System.out.println("Before Sorting:");

        for (int score : scores) {
            System.out.print(score + " ");
        }

        for (int i = 0; i < scores.length - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < scores.length; j++) {

                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = scores[i];
            scores[i] = scores[minIndex];
            scores[minIndex] = temp;
        }

        System.out.println("\n\nAfter Sorting:");

        for (int score : scores) {
            System.out.print(score + " ");
        }
    }
}