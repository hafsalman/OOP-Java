//Hafsa Salman
//OOP Lab 08: Task no. 05

import java.util.Scanner;

public class Task_05
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("OOP Lab 08: Task no. 05");
        System.out.println();

        Scanner s = new Scanner(System.in);

        int choice;

        SavingsAccount sa = new SavingsAccount(10000);

        System.out.println("Welcome...");

        do
        {
            System.out.println("Main Menu");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = s.nextInt();

            System.out.println();

            if (choice == 1)
            {
                System.out.print("Enter money to deposit: ");
                double money = s.nextDouble();

                sa.deposit(money);

                System.out.println("Money deposited successfully!");
                System.out.println("New Balance: " + sa.getBalance());
                System.out.println();
            }

            else if (choice == 2)
            {
                System.out.print("Enter money to withdraw: ");
                double money = s.nextDouble();

                sa.withdraw(money);

                System.out.println("Money withdraw successfully!");
                System.out.println("New Balance: " + sa.getBalance());
                System.out.println();
            }

            else if (choice == 3)
            {
                System.out.println("Balance: " + sa.getBalance());
                System.out.println();
            }
        }
        while (choice != 4);
    }
}

interface BankAccount
{
    public void deposit(double amount);
    public void withdraw(double amount);
    public double getBalance();
}

class SavingsAccount implements BankAccount
{
    private double balance;

    public SavingsAccount(double balance)
    {
        this.balance = balance;
    }

    @Override
    public void deposit(double amount)
    {
        balance += amount;
    }

    @Override
    public void withdraw(double amount)
    {
        balance -= amount;
    }

    @Override
    public double getBalance()
    {
        return balance;
    }
}