package collections_practice_and_dsa_practice.gcrcodebase.binary_search.starcatalog;

public class RotatedSearch {


    public static int search(int[] brightness, int target) {

        int left = 0;
        int right = brightness.length - 1;


        while(left <= right) {

            int mid = left + (right - left) / 2;


            if(brightness[mid] == target)
                return mid;


            // Left part is sorted
            if(brightness[left] <= brightness[mid]) {


                if(target >= brightness[left] && target < brightness[mid])
                    right = mid - 1;

                else
                    left = mid + 1;
            }


            // Right part is sorted
            else {


                if(target > brightness[mid] && target <= brightness[right])
                    left = mid + 1;

                else
                    right = mid - 1;
            }
        }


        return -1;
    }



    public static void main(String[] args) {


        int[] brightness = {40,50,60,10,20,30};


        int target = 20;


        int result = search(brightness,target);


        System.out.println("Target found at index: " + result);
    }
}