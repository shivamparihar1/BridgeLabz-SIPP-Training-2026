package corejava.gcrcodebase.controlflow.Level2;

import java.util.Scanner;

public class YoungestAndTallestFriend {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter Amar's age: ");
        int amarAge = scanner.nextInt();

        System.out.print("Enter Akbar's age: ");
        int akbarAge = scanner.nextInt();

        System.out.print("Enter Anthony's age: ");
        int anthonyAge = scanner.nextInt();


        System.out.print("Enter Amar's height: ");
        double amarHeight = scanner.nextDouble();

        System.out.print("Enter Akbar's height: ");
        double akbarHeight = scanner.nextDouble();

        System.out.print("Enter Anthony's height: ");
        double anthonyHeight = scanner.nextDouble();


        String youngestFriend;
        if (amarAge < akbarAge && amarAge < anthonyAge) {
            youngestFriend = "Amar";
        } else if (akbarAge < amarAge && akbarAge < anthonyAge) {
            youngestFriend = "Akbar";
        } else {
            youngestFriend = "Anthony";
        }


        String tallestFriend;
        if (amarHeight > akbarHeight && amarHeight > anthonyHeight) {
            tallestFriend = "Amar";
        } else if (akbarHeight > amarHeight && akbarHeight > anthonyHeight) {
            tallestFriend = "Akbar";
        } else {
            tallestFriend = "Anthony";
        }

        System.out.println("Youngest Friend: " + youngestFriend);
        System.out.println("Tallest Friend: " + tallestFriend);

        scanner.close();
    }
}