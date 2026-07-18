package collections_practice_and_dsa_practice.gcrcodebase.Hashing;

import java.util.*;

public class GroupAnagramTickets {


    public static List<List<String>> groupAnagrams(String[] strs) {


        Map<String, List<String>> groups = new HashMap<>();


        for (String s : strs) {


            char[] chars = s.toCharArray();


            Arrays.sort(chars);


            String key = new String(chars);


            groups.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }


        return new ArrayList<>(groups.values());
    }



    public static void main(String[] args) {


        String[] tickets = {
                "listen",
                "silent",
                "enlist",
                "hello",
                "ohlle",
                "world"
        };


        List<List<String>> result = groupAnagrams(tickets);


        System.out.println("Grouped Support Tickets:");

        for (List<String> group : result) {

            System.out.println(group);
        }
    }
}
