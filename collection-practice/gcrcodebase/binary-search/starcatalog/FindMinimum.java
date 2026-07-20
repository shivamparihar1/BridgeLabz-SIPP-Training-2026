package collections_practice_and_dsa_practice.gcrcodebase.binary_search.starcatalog;

public class FindMinimum {


    public static int findMinimum(int[] brightness) {


        int left = 0;
        int right = brightness.length - 1;


        while(left < right) {


            int mid = left + (right-left)/2;


            // Minimum is on right side
            if(brightness[mid] > brightness[right]) {

                left = mid + 1;

            }

            // Minimum is on left side
            else {

                right = mid;
            }
        }


        return brightness[left];
    }



    public static void main(String[] args) {


        int[] brightness = {40,50,60,10,20,30};


        int minimum = findMinimum(brightness);


        System.out.println("Minimum brightness value: " + minimum);
    }
}