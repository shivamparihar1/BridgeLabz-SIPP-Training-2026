package oops_practice.gcrcodebase.encapsulation_and_abstraction.bankingsystem;

public class Main {

    public static void main(String[] args) {

        SavingsAccount savingsAccount =
                new SavingsAccount(101, "Shivam", 50000, 5);

        CurrentAccount currentAccount =
                new CurrentAccount(102, "Rahul", 80000, 3);

        System.out.println("Savings Account");

        savingsAccount.deposit(10000);

        savingsAccount.withdraw(5000);

        savingsAccount.displayAccountDetails();

        System.out.println("Interest: " + savingsAccount.calculateInterest());


        System.out.println();


        System.out.println("Current Account");

        currentAccount.deposit(20000);

        currentAccount.withdraw(10000);

        currentAccount.displayAccountDetails();

        System.out.println("Interest: " + currentAccount.calculateInterest());
    }
}