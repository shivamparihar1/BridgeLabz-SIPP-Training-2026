package corejava.gcrcodebase.recursion.recursion_scenario_problem;
import java.util.Scanner;

public class UsernameValidatorRecursion {

    public static boolean isValid(String str, int index) {

        if (index == str.length()) {
            return true;
        }

        char ch = str.charAt(index);

        if (ch < 'a' || ch > 'z') {
            return false;
        }

        return isValid(str, index + 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        boolean result = isValid(username, 0);

        System.out.println(result);

        sc.close();
    }
}
