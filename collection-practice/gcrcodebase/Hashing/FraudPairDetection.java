package collections_practice_and_dsa_practice.gcrcodebase.Hashing;

import java.util.*;

public class FraudPairDetection {


    public static int[] findFraudPair(int[] amounts, int target) {


        Map<Integer, Integer> seen = new HashMap<>();


        for (int i = 0; i < amounts.length; i++) {


            int complement = target - amounts[i];


            if (seen.containsKey(complement)) {

                return new int[]{seen.get(complement), i};
            }


            seen.put(amounts[i], i);
        }


        return new int[]{-1, -1};
    }



    public static void main(String[] args) {


        int[] amounts = {2000, 5000, 7000, 10000};

        int target = 12000;


        int[] result = findFraudPair(amounts, target);


        if (result[0] != -1) {

            System.out.println("Fraud pair indices: "
                    + result[0] + " and " + result[1]);

        }
        else {

            System.out.println("No fraud pair found");
        }
    }
}