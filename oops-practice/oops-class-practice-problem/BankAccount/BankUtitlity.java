package oops_practice.oops_class_practice_problem.BankAccount;

import java.util.Scanner;

public class BankUtitlity {
    BankCustomer bankCustomer;

    public void createAccount(){
        Scanner sc = new Scanner(System.in);
        int account_number = (int)(Math.random()*900000)/100000;
        System.out.println("Enter your account Name");
        String name = sc.nextLine();
        double balance = 50000;
        bankCustomer = new BankCustomer(account_number, name, balance);
        System.out.println("Account Created");
        BankCustomer.Bank_TotalAccountNumber++;
    }

    public void deposit(double amount) {
        bankCustomer = new BankCustomer(12345, "Sahil", 5000);
        BankCustomer.Bank_TotalAccountNumber++;
        if (amount > 0) {
            System.out.println("Invalid Amount");
        } else {
            bankCustomer.Bank_Balance += amount;
            System.out.println("Deposited Amount"+amount);
            System.out.println("Currenct Balance is"+bankCustomer.Bank_Balance);
        }
    }


        public void withdraw(double amount){
            if(amount > bankCustomer.Bank_Balance){
                System.out.println("Insufficient Balance");
            }
            else{
                bankCustomer.Bank_Balance-=amount;
                System.out.println("Withdrawl Amount is"+amount);
                System.out.println("Bank Balance is"+ bankCustomer.Bank_Balance);
            }
        }

        public void getStatement(){
            System.out.println(bankCustomer.toString());
        }



}
