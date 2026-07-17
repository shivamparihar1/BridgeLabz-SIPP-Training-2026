package corejava.gcrcodebase.recursion.recursion_practice_problem;
import java.util.Scanner;

public class ReverseStringRecursion {

    public static String reverse(String str) {

        if (str.isEmpty()) {
            return str;
        }

        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = reverse(str);

        System.out.println(result);

        sc.close();
    }
}