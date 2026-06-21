package corejava.gcrcodebase.methods.level3;

import java.util.Random;

public class FootballTeamHeightAnalysis {

    public static int findSum(int[] heights) {
        int sum = 0;

        for (int height : heights) {
            sum += height;
        }

        return sum;
    }

    public static double findMeanHeight(int[] heights) {
        return (double) findSum(heights) / heights.length;
    }

    public static int findShortestHeight(int[] heights) {
        int shortest = heights[0];

        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }

        return shortest;
    }

    public static int findTallestHeight(int[] heights) {
        int tallest = heights[0];

        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }

        return tallest;
    }

    public static void main(String[] args) {

        int[] heights = new int[11];
        Random random = new Random();

        for (int i = 0; i < heights.length; i++) {
            heights[i] = random.nextInt(101) + 150;
        }

        System.out.println("Player Heights (cm):");

        for (int height : heights) {
            System.out.print(height + " ");
        }

        System.out.println("\n");
        System.out.println("Sum of Heights = " + findSum(heights));
        System.out.println("Mean Height = " + findMeanHeight(heights));
        System.out.println("Shortest Height = " + findShortestHeight(heights));
        System.out.println("Tallest Height = " + findTallestHeight(heights));
    }
}