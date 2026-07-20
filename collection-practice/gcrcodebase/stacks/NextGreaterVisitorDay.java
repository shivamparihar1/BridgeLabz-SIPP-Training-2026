package collections_practice_and_dsa_practice.gcrcodebase.stacks;

import java.util.*;

public class NextGreaterVisitorDay {


    public static int[] nextBusierDay(int[] visitors) {


        int n = visitors.length;

        int[] answer = new int[n];

        Arrays.fill(answer, -1);


        Deque<Integer> stack = new ArrayDeque<>();


        for (int i = 0; i < n; i++) {


            while (!stack.isEmpty() && visitors[i] > visitors[stack.peek()]) {

                answer[stack.pop()] = visitors[i];
            }


            stack.push(i);
        }


        return answer;
    }



    public static void main(String[] args) {


        int[] visitors = {100, 80, 120, 70, 90, 150};


        int[] result = nextBusierDay(visitors);


        System.out.println("Next higher visitor count:");

        System.out.println(Arrays.toString(result));
    }
}