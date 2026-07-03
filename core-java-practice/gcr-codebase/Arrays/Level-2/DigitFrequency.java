package corejava.gcrcodebase.arrays.level2;

import java.util.Scanner;

public class DigitFrequency {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int temp = number;
        int count = 0;

        if (number == 0) {
            count = 1;
        } else {
            while (temp != 0) {
                count++;
                temp = temp / 10;
            }
        }

        int[] digits = new int[count];
        int index = 0;

        temp = number;

        if (number == 0) {
            digits[0] = 0;
        } else {
            while (temp != 0) {
                digits[index] = temp % 10;
                temp = temp / 10;
                index++;
            }
        }

        int[] freq = new int[10];

        for (int i = 0; i < digits.length; i++) {
            freq[digits[i]]++;
        }

        System.out.println("Frequency of each digit:");

        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println(i + " occurs " + freq[i] + " times");
            }
        }

        sc.close();
    }
}