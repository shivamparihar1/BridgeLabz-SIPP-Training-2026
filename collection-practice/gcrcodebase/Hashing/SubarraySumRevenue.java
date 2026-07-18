package collections_practice_and_dsa_practice.gcrcodebase.Hashing;

import java.util.*;

public class SubarraySumRevenue {


    public static int subarraySumEqualsK(int[] revenueChanges, int k) {


        Map<Integer, Integer> prefixCount = new HashMap<>();

        prefixCount.put(0, 1);


        int runningSum = 0;

        int answer = 0;


        for (int change : revenueChanges) {


            runningSum += change;


            answer += prefixCount.getOrDefault(runningSum - k, 0);


            prefixCount.put(
                    runningSum,
                    prefixCount.getOrDefault(runningSum, 0) + 1
            );
        }


        return answer;
    }



    public static void main(String[] args) {


        int[] revenueChanges = {5, -2, -3, 4, -4, 1};

        int k = 0;


        int result = subarraySumEqualsK(revenueChanges, k);


        System.out.println("Number of revenue-neutral periods: " + result);
    }
}