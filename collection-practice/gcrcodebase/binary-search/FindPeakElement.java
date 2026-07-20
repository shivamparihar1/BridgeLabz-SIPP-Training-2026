package collections_practice_and_dsa_practice.gcrcodebase.binary_search;

public class FindPeakElement {

    public static int findPeak(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if ((mid == 0 || arr[mid] > arr[mid - 1]) &&
                    (mid == arr.length - 1 || arr[mid] > arr[mid + 1])) {

                return mid;
            }

            else if (mid > 0 && arr[mid] < arr[mid - 1]) {

                right = mid - 1;
            }

            else {

                left = mid + 1;
            }
        }

        return -1;
    }


    public static void main(String[] args) {

        int[] arr = {10, 20, 15, 2, 23, 90, 67};

        int index = findPeak(arr);

        System.out.println("Peak element index: " + index);
        System.out.println("Peak element value: " + arr[index]);
    }
}