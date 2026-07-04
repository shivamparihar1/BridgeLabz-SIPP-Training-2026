package corejava.gcrcodebase.exception_handling.exception_handling_scenario_problem.bank_atm;

public class InsufficientBalanceException extends Exception {

    private int balance;
    private int withdrawAmount;

    public InsufficientBalanceException(int balance, int withdrawAmount) {
        super("Insufficient balance. Available: " + balance +
                ", Requested: " + withdrawAmount);
        this.balance = balance;
        this.withdrawAmount = withdrawAmount;
    }

    public int getBalance() {
        return balance;
    }

    public int getWithdrawAmount() {
        return withdrawAmount;
    }
}