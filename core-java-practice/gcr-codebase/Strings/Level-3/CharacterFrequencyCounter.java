package corejava.gcrcodebase.strings.level3;
import java.util.Scanner;

public class CharacterFrequencyCounter {

    public static String[][] findCharacterFrequency(String text) {

        int[] frequency = new int[256];

        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        int uniqueCount = 0;

        for (int i = 0; i < text.length(); i++) {
            if (frequency[text.charAt(i)] != 0) {
                uniqueCount++;
                frequency[text.charAt(i)] = 0;
            }
        }

        String[][] result = new String[uniqueCount][2];

        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        int index = 0;

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (frequency[ch] > 0) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(frequency[ch]);

                frequency[ch] = 0;
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[][] result = findCharacterFrequency(text);

        System.out.println("\nCharacter\tFrequency");

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t\t" + result[i][1]);
        }

        sc.close();
    }
}