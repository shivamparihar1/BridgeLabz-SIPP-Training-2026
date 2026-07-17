package oops_practice.gcrcodebase.encapsulation_and_abstraction.bankingsystem;

public class CurrentAccount extends BankAccount {

    private double monthlyBonusRate;

    public CurrentAccount(int accountNumber, String holderName, double balance, double monthlyBonusRate) {
        super(accountNumber, holderName, balance);
        this.monthlyBonusRate = monthlyBonusRate;
    }

    public double getMonthlyBonusRate() {
        return monthlyBonusRate;
    }

    public void setMonthlyBonusRate(double monthlyBonusRate) {
        this.monthlyBonusRate = monthlyBonusRate;
    }

    public double calculateInterest() {
        return getBalance() * monthlyBonusRate / 100;
    }
}