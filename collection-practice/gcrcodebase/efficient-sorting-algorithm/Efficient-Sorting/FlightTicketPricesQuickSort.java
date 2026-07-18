package collections_practice_and_dsa_practice.gcrcodebase.efficient_sorting_algorithm.normal_questions;

public class FlightTicketPricesQuickSort {

    public static void quickSort(int[] prices, int low, int high) {

        if (low < high) {

            int pivotIndex = partition(prices, low, high);

            quickSort(prices, low, pivotIndex - 1);
            quickSort(prices, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] prices, int low, int high) {

        int pivot = prices[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (prices[j] <= pivot) {

                i++;

                int temp = prices[i];
                prices[i] = prices[j];
                prices[j] = temp;
            }
        }

        int temp = prices[i + 1];
        prices[i + 1] = prices[high];
        prices[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {

        int[] prices = {4500, 2200, 3800, 1800, 5200};

        System.out.println("Before Sorting:");

        for (int price : prices) {
            System.out.print(price + " ");
        }

        quickSort(prices, 0, prices.length - 1);

        System.out.println("\n\nAfter Sorting:");

        for (int price : prices) {
            System.out.print(price + " ");
        }
    }
}