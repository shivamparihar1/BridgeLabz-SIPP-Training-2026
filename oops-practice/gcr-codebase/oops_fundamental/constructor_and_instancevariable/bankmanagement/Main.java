package oops_practice.gcrcodebase.oops_fundamental.constructor_and_instancevariable.bankmanagement;

public class Main {

    public static void main(String[] args) {

        SavingsAccount account = new SavingsAccount(
                123456,
                "Shivam",
                50000,
                5.5
        );

        account.displayDetails();

        account.setBalance(60000);

        System.out.println();

        System.out.println("After Updating Balance");
        System.out.println("Balance: " + account.getBalance());
    }
}