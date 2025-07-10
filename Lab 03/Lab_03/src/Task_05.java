//Hafsa Salman
//OOP Lab 03: Task no. 05

import java.util.Objects;
import java.util.Scanner;

public class Task_05
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("OOP Lab 03: Task no. 05");
        System.out.println();

        Scanner s = new Scanner(System.in);

        BankAccount b = new BankAccount("123456789", "Hafsa", 1000);

        System.out.print("Enter Account Number: ");
        String number = s.nextLine();

        System.out.println();

        int choice;
        char meow;

        if (Objects.equals(number, b.accountNumber))
        {
            do
            {
                System.out.println("Welcome " + b.accountHolderName + "!");
                System.out.println("\nMain Menu:");
                System.out.println("1. Deposit Money");
                System.out.println("2. Withdraw Money");

                System.out.print("Enter your choice: ");
                choice = s.nextInt();

                System.out.println();

                if (choice == 1)
                {
                    System.out.print("Enter Money: ");
                    double amount = s.nextDouble();

                    b.deposit(amount);
                }

                else if (choice == 2)
                {
                    System.out.print("Enter Money: ");
                    double money = s.nextDouble();

                    b.withdraw(money);
                }

                System.out.println();
                System.out.print("Do you wish to continue? [Y/y]: ");
                meow = s.next().charAt(0);
            } while (meow == 'Y' || meow == 'y');
        }

        else
        {
            System.out.println("Wrong Account Number!");
        }
    }
}

class BankAccount
{
    String accountNumber;
    String accountHolderName;
    double balance;

    public  BankAccount(String accountNumber, String accountHolderName, double balance)
    {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount)
    {
        balance += amount;

        System.out.println("Current balance: " + balance);
    }

    public void withdraw(double amount)
    {
        balance -= amount;

        if (balance < 0)
        {
            balance = 0;
        }

        System.out.println("Current balance: " + balance);
    }
}