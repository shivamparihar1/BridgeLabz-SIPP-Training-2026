package oops_practice.gcrcodebase.oops_fundamental.class_and_object.level_2;
public class BankAccountATM {

    String accountHolder;
    int accountNumber;
    double balance;

    BankAccountATM(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {

        BankAccountATM account = new BankAccountATM("Shivam", 123456, 10000);

        account.displayBalance();

        account.deposit(5000);

        account.withdraw(3000);

        account.displayBalance();
    }
}