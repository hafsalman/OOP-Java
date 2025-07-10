//Hafsa Salman
//OOP Lab 02: Task no. 10
/* Write a program to print the factorial of a number by defining a method named 'Factorial'.
Factorial of any number n is represented by n! and is equal to 1*2*3*.... *(n-1) *n. E.g.-
4! = 1*2*3*4 = 24
3! = 3*2*1 = 6
2! = 2*1 = 2
Also,
1! = 1
0! = 0
 */

import java.util.Scanner;

public class Task_10
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("OOP Lab 02: Task no. 10");
        System.out.println();

        Scanner s =  new Scanner(System.in);

        System.out.print("Enter number: ");
        int num  = s.nextInt();

        int fac = 1;

        for (int i = num; i > 0; i--)
        {
            fac *= i;
        }

        System.out.println("Factorial of " + num + ": " + fac);
    }
}