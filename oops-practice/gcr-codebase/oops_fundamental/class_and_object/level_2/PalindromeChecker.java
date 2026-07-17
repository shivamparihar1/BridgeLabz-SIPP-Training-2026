package oops_practice.gcrcodebase.oops_fundamental.class_and_object.level_2;
public class PalindromeChecker {

    String text;

    PalindromeChecker(String text) {
        this.text = text;
    }

    boolean isPalindrome() {
        String reverse = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reverse += text.charAt(i);
        }

        return text.equalsIgnoreCase(reverse);
    }

    void displayResult() {
        System.out.println("Text: " + text);

        if (isPalindrome()) {
            System.out.println("It is a Palindrome.");
        } else {
            System.out.println("It is not a Palindrome.");
        }
    }

    public static void main(String[] args) {

        PalindromeChecker checker = new PalindromeChecker("madam");

        checker.displayResult();
    }
}