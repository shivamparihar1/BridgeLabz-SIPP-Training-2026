package corejava.gcrcodebase.methods.level1;
import java.util.Scanner;

public class AthleteRoundsCalculator {

    public static double calculateRounds(double side1, double side2, double side3) {

        double perimeter = side1 + side2 + side3;
        double distance = 5000;

        return distance / perimeter;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first side of triangle (in meters): ");
        double side1 = sc.nextDouble();

        System.out.print("Enter second side of triangle (in meters): ");
        double side2 = sc.nextDouble();

        System.out.print("Enter third side of triangle (in meters): ");
        double side3 = sc.nextDouble();

        double rounds = calculateRounds(side1, side2, side3);

        System.out.printf("The athlete must complete %.2f rounds to run 5 km.%n", rounds);

        sc.close();
    }
}