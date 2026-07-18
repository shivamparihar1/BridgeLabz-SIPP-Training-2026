package collections_practice_and_dsa_practice.gcrcodebase.twopointers_and_slidingwindow;

public class ServerCPUSpikeDetection {

    public static int maxSubarrayOfSizeK(int[] cpuLoad, int k) {

        int windowSum = 0;
        int maxSum = Integer.MIN_VALUE;

        int start = 0;


        for (int end = 0; end < cpuLoad.length; end++) {

            windowSum += cpuLoad[end];


            if (end >= k - 1) {

                maxSum = Math.max(maxSum, windowSum);

                windowSum -= cpuLoad[start];

                start++;
            }
        }

        return maxSum;
    }


    public static void main(String[] args) {


        int[] cpuLoad = {30, 40, 50, 20, 10, 60, 70};

        int k = 3;


        int result = maxSubarrayOfSizeK(cpuLoad, k);


        System.out.println("Maximum CPU load in " + k + " seconds: " + result);
    }
}