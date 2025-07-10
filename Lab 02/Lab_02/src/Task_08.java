//Hafsa Salman
//OOP Lab 02: Task no. 08
/* Write a Java program to add two numbers without using any arithmetic operators */

import java.util.Scanner;

public class Task_08
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("OOP Lab 02: Task no. 08");
        System.out.println();

        Scanner s =  new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = s.nextInt();

        System.out.print("Enter second number: ");
        int b = s.nextInt();

        int c = Math.addExact(a, b);

        System.out.println("Sum: " + c);
    }
}