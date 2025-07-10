//Hafsa Salman
//OOP Lab 02: Task no. 06
/* Create a menu-driven transactions’ processing unit in a bank as long as user enters correct input. Initially, take the username
and password as input from user. If that username and password is correct then the user will log in to the system and can perform any
transaction as per the menu shown below.

			Main Menu ** Welcome to Bank of Pakistan**
1.	Deposit Money
2.	Withdraw Amount
3.	Account status
Select your choice: ____
(After completing the selected transaction) Do you want to continue? [y/Y]
(goes to Main Menu, if y/Y is pressed)
Depending upon the user’s choice, perform the transaction and display the remaining account balance along with the owner’s username.
 */

import java.util.Scanner;

public class Task_06
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("OOP Lab 02: Task no. 06");
        System.out.println();

        Scanner s = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = s.nextLine();

        System.out.print("Enter password: ");
        String password = s.nextLine();

        int amount = 1000;
        String status = "Active";

        if (username.equals("user") && password.equals("pass"))
        {
            char choice;

            do
            {
                System.out.println("Welcome to the Bank of Pakistan");
                System.out.println("Main Menu");
                System.out.println("1. Deposit Money");
                System.out.println("2. Withdraw Amount");
                System.out.println("3. Account Status");
                System.out.println();

                System.out.print("Enter your choice: ");
                int c = s.nextInt();

                switch (c)
                {
                    case 1:
                    {
                        System.out.print("Money to deposit: ");
                        int money = s.nextInt();

                        amount += money;

                        System.out.println("Amount Balance: " + amount);

                        break;
                    }

                    case 2:
                    {
                        System.out.print("Money to withdraw: ");
                        int money = s.nextInt();

                        amount -= money;

                        System.out.println("Amount Balance: " + amount);

                        break;
                    }

                    case 3:
                    {
                        System.out.println("Account Status: " + status);

                        break;
                    }

                    default:
                    {
                        System.out.println("Invalid choice.");
                    }
                }

                System.out.print("Do you want to continue? [y/Y]: ");
                choice = s.next().charAt(0);
            }
            while (choice == 'Y' || choice == 'y');
        }
    }
}