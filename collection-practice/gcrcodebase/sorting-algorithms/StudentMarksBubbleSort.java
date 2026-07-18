package collections_practice_and_dsa_practice.gcrcodebase.sorting_algorithms;
public class StudentMarksBubbleSort {

    public static void main(String[] args) {

        int[] marks = {78, 45, 92, 67, 55, 89};

        System.out.println("Before Sorting:");

        for (int mark : marks) {
            System.out.print(mark + " ");
        }

        for (int i = 0; i < marks.length - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < marks.length - 1 - i; j++) {

                if (marks[j] > marks[j + 1]) {

                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;

                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }

        System.out.println("\n\nAfter Sorting:");

        for (int mark : marks) {
            System.out.print(mark + " ");
        }
    }
}