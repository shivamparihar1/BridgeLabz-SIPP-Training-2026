package oops_practice.oops_class_practice_problem.BankAccount;

import java.util.Scanner;

public class BankMenu {
    public  void bankDisplay(){
        BankUtitlity bankUtitlity = new BankUtitlity();
        System.out.println("-----------------------------------------------------");
        System.out.println("WELCOME TO SBI BANK");
        System.out.println("-----------------------------------------------------");

        while(true){
            System.out.println("1.CREATE ACCOUNT\n2.DEPOSIT\n3.WITHDRAWL\n4.Get statement\n5.EXIT");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            if(choice == 5)
                break;

        switch (choice){
            case 1: bankUtitlity.createAccount();

            break;

            case 2:
            System.out.println("Enter amount to deposit");
            double amount = sc.nextDouble();
            bankUtitlity.deposit(amount);
            break;

            case 3:
            System.out.println("Enter amount to withdraw");
            amount = sc.nextDouble();
            bankUtitlity.withdraw(amount);
            break;

            case 4:
                bankUtitlity.getStatement();
                break;

            default:
                System.out.println("Invalid choice");

                }


        }

    }

}
