package collections_practice_and_dsa_practice.gcrcodebase.Hashing;

import java.util.*;

public class DuplicateSessionToken {


    public static boolean hasDuplicateToken(String[] tokens) {


        Set<String> seen = new HashSet<>();


        for (String token : tokens) {


            if (!seen.add(token)) {

                return true;
            }
        }


        return false;
    }



    public static void main(String[] args) {


        String[] tokens = {
                "abc123",
                "xyz456",
                "pqr789",
                "abc123"
        };


        boolean result = hasDuplicateToken(tokens);


        System.out.println("Duplicate token exists: " + result);
    }
}