//Hafsa Salman
//OOP Lab 02: Task no. 02
/* This programming exercise demonstrates a program that calculates a customer’s bill for a local cable company. There are two types
of customers: residential and business. So, billing rates would vary for residential customers and business customers.
•	For residential customers, the following rates apply:
Bill processing fee: $4.50
Basic service fee: $20.50
Premium channels: $7.50 per channel.
•	For business customers, the following rates apply:
Bill processing fee: $15.00
Basic service fee: $75.00 for first 10 connections, $5.00 for each additional connection
Premium channels: $50.00 per channel for any number of connections

The program should ask the user for an account number (an integer) and a customer
code. Assume that R or r stands for a residential customer, and B or b stands for a
business customer in customer code.

Input: 	The customer’s account number, customer code, number of premium channels to which the user subscribes, and, in the case of
business customers, number of basic service connections.

Output: Customer’s account number and the billing amount.
 */

import java.util.Scanner;

public class Task_02
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("OOP Lab 02: Task no. 02");
        System.out.println();

        Scanner s =  new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        int acc =  s.nextInt();

        System.out.print("Enter Customer Code: ");
        char code = s.next().charAt(0);

        System.out.println();

        switch (code)
        {
            case 'B', 'b' ->
            {
                System.out.print("Enter number of connections: ");
                int connections = s.nextInt();

                System.out.println();

                int BPE = 15;
                int PC = 50;
                int BSF;

                if (connections > 10)
                {
                    int c = connections - 10;
                    BSF = 75 + (c * 5);
                }

                else
                {
                    BSF = 75;
                }

                int amount = BPE + PC + BSF;

                System.out.println("Account Number: " + acc);
                System.out.println("Billing Amount: " + amount);

                break;
            }

            case 'R', 'r' ->
            {
                System.out.print("Enter number of premium channels: ");
                int channels = s.nextInt();

                System.out.println();

                double  BPE = 4.50;
                double PC = 7.50;
                double BSF = 20.50;

                double amount = BPE + (PC * channels) + BSF;

                System.out.println("Account Number: " + acc);
                System.out.println("Billing Amount: " + amount);

                break;
            }

            default ->
            {
                System.out.println("Invalid input");

                break;
            }
        }
    }
}