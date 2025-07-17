//Hafsa Salman
//OOP Lab 10: Task no. 02

import java.util.Scanner;

public class Task_02
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("OOP Lab 10: Task no. 02");
        System.out.println();

        Scanner s = new Scanner(System.in);

        System.out.print("Enter number: ");
        String n = s.nextLine();

        System.out.println("Factorial of " + n + ": " + calculateFactorial(n));
    }

    public static int calculateFactorial(String n)
    {
        try
        {
            if (n == null || n.trim().isEmpty())
            {
                throw new Exception("String can not be null or empty");
            }

            int num =  Integer.parseInt(n);

            if (num < 0)
            {
                throw new Exception("Number is negative");
            }

            int factorial = 1;

            for (int i = 1; i <= num; i++)
            {
                factorial *= i;
            }

            return factorial;
        }

        catch (Exception e)
        {
            System.out.println("Error: Invalid number. Please enter valid integer.");

            return -1;
        }
    }
}