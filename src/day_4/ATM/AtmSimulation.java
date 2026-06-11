package day_4.ATM;

import java.util.Scanner;

public class AtmSimulation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Account account = new Account();
        System.out.println(account.balance);
        String lastTransaction = "No Transaction yet.";

        int choice = 0;

        while(choice != 5){

            System.out.println("\n===== ATM Menu =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Mini Statement");
            System.out.println("5. Exit");

            System.out.print("\nEnter Here: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    System.out.println("check balance");
                    break;
                case 2:
                    System.out.println("Depositie moeny");
                    break;
                case 3:
                    System.out.println("withsda");
                    break;
                case 4:
                    System.out.println(lastTransaction);
                    break;
                case 5:
                    System.out.println("Application close.");
                    break;
                default:
                    System.out.println("Invalid Input, Please try again.");
            }

        }
    }
}
