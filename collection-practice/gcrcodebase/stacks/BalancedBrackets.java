package collections_practice_and_dsa_practice.gcrcodebase.stacks;

import java.util.*;

public class BalancedBrackets {


    public static boolean isValidConfig(String s) {

        Deque<Character> stack = new ArrayDeque<>();

        Map<Character, Character> matchFor = new HashMap<>();

        matchFor.put(')', '(');
        matchFor.put(']', '[');
        matchFor.put('}', '{');


        for (char c : s.toCharArray()) {


            if (c == '(' || c == '[' || c == '{') {

                stack.push(c);

            }
            else {

                if (stack.isEmpty() || stack.pop() != matchFor.get(c)) {

                    return false;
                }
            }
        }


        return stack.isEmpty();
    }



    public static void main(String[] args) {


        String config1 = "{[()]}";

        String config2 = "{[(])}";


        System.out.println("Config 1 valid: " + isValidConfig(config1));

        System.out.println("Config 2 valid: " + isValidConfig(config2));
    }
}