package collections_practice_and_dsa_practice.gcrcodebase.binary_search.starcatalog;
public class BinarySearch {

    public static int search(int[] brightness, int target) {

        int left = 0;
        int right = brightness.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (brightness[mid] == target) {
                return mid;
            }
            else if (brightness[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return -1;
    }


    public static void main(String[] args) {

        int[] brightness = {10, 20, 30, 40, 50, 60};

        int target = 40;

        int result = search(brightness, target);

        if(result != -1)
            System.out.println("Star brightness found at index: " + result);
        else
            System.out.println("Star brightness not found");
    }
}