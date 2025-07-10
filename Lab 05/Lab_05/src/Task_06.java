//Hafsa Salman
//OOP Lab 05: Task no. 06

import java.util.ArrayList;
import java.util.Scanner;

public class Task_06
{
    public static boolean isPrime(int number)
    {
        if (number <= 1)
        {
            return false;
        }

        else
        {
            for (int i=2; i<=Math.sqrt(number); i++)
            {
                if (number % i == 0)
                {
                    return false;
                }
            }

            return true;
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("OOP Lab 05: Task no. 06");
        System.out.println();

        Scanner s = new Scanner(System.in);

        ArrayList<Integer> num = new ArrayList<Integer>();

        System.out.println("Inputting 5 numbers...");

        for (int i=0; i<5; i++)
        {
            System.out.print("Enter number: ");
            num.add(s.nextInt());
        }

        boolean hasPrime = false;

        for (int numbers : num)
        {
            if (isPrime(numbers))
            {
                hasPrime = true;

                break;
            }
        }

        int sum = 0;

        if (hasPrime)
        {
            System.out.println("\nPrime number is present in the list");

            for (int i=0; i<num.size(); i+=2)
            {
                sum += num.get(i);
            }

            System.out.println("Sum of even indices: " + sum);
        }

        else
        {
            System.out.println("\nPrime number is not present in the list");

            for  (int i=1; i<num.size(); i+=2)
            {
                sum += num.get(i);
            }

            System.out.println("Sum of odd indices: " + sum);
        }
    }
}