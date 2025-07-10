//Hafsa Salman
//OOP Lab 02: Task no. 07
/* Write a program to print the circumference and area of a circle of radius entered by user by defining your own method. */

import java.util.Scanner;

public class Task_07
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("OOP Lab 02: Task no. 07");
        System.out.println();

        Scanner s = new Scanner(System.in);

        System.out.print("Enter radius: ");
        int radius = s.nextInt();

        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Circumference: " + circumference);
        System.out.println("Area: " + area);
    }
}