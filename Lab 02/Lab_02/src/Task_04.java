//Hafsa Salman
//OOP Lab 02: Task no 04
/* Write a program to check if the number is a prime number or not. */

import java.util.Scanner;

public class Task_04
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("OOP Lab 02: Task no. 04");
        System.out.println();

        Scanner s  =  new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = s.nextInt();

        boolean prime = true;

        if (num <= 1)
        {
            prime = false;
        }

        else
        {
            for (int i = 2; i <= Math.sqrt(num); i++)
            {
                if (num % i == 0)
                {
                    prime = false;
                    break;
                }
            }
        }

        if (prime)
        {
            System.out.println(num + " is a prime number.");
        }

        if (!prime)
        {
            System.out.println(num + " is not a prime number.");
        }
    }
}