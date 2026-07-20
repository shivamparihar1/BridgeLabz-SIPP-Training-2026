package collections_practice_and_dsa_practice.gcrcodebase.binary_search;

public class FindRotationPoint {

    public static int findRotationPoint(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] > arr[right]) {
                left = mid + 1;
            }
            else {
                right = mid;
            }
        }

        return left;
    }

    public static void main(String[] args) {

        int[] arr = {40, 50, 60, 10, 20, 30};

        int index = findRotationPoint(arr);

        System.out.println("Rotation point index: " + index);
        System.out.println("Smallest element: " + arr[index]);
    }
}