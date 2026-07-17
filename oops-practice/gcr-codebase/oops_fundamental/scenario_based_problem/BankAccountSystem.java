package oops_practice.gcrcodebase.oops_fundamental.scenario_based_problem;

public class BankAccountSystem {

    int accountNumber;
    String holder;
    double balance;

    static int totalAccounts = 0;

    BankAccountSystem(int accountNumber, String holder, double balance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
        totalAccounts++;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited successfully.");
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Withdrawal failed. Insufficient balance.");
        }
    }

    void getStatement() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holder);
        System.out.println("Balance: " + balance);
    }

    static void displayTotalAccounts() {
        System.out.println("Total Accounts Created: " + totalAccounts);
    }

    public static void main(String[] args) {

        BankAccountSystem account1 = new BankAccountSystem(101, "Shivam", 50000);
        BankAccountSystem account2 = new BankAccountSystem(102, "Rahul", 30000);
        BankAccountSystem account3 = new BankAccountSystem(103, "Amit", 40000);

        System.out.println("Account 1 Transactions");
        account1.deposit(5000);
        account1.withdraw(2000);
        account1.deposit(3000);
        account1.withdraw(10000);
        account1.getStatement();

        System.out.println();

        System.out.println("Account 2 Transactions");
        account2.deposit(7000);
        account2.withdraw(5000);
        account2.deposit(2000);
        account2.withdraw(15000);
        account2.getStatement();

        System.out.println();

        System.out.println("Account 3 Transactions");
        account3.deposit(10000);
        account3.withdraw(8000);
        account3.deposit(4000);
        account3.withdraw(12000);
        account3.getStatement();

        System.out.println();

        BankAccountSystem.displayTotalAccounts();
    }
}