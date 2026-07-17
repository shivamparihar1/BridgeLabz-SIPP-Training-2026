package oops_practice.gcrcodebase.oops_fundamental.static_final_instanceOf_keywords;

public class BankAccountSystem {

    static String bankName = "State Bank of India";
    static int totalAccounts = 0;

    final int accountNumber;
    String accountHolderName;
    double balance;

    BankAccountSystem(String accountHolderName, int accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }

    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    void displayDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {

        BankAccountSystem account1 = new BankAccountSystem(
                "Shivam",
                10101,
                50000
        );

        BankAccountSystem account2 = new BankAccountSystem(
                "Rahul",
                10102,
                75000
        );

        if (account1 instanceof BankAccountSystem) {
            account1.displayDetails();
        }

        System.out.println();

        if (account2 instanceof BankAccountSystem) {
            account2.displayDetails();
        }

        System.out.println();

        BankAccountSystem.getTotalAccounts();
    }
}