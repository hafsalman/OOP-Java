//Hafsa Salman
//OOP Lab 01: Task no. 02
/* a) Write an application that accepts two doubles, multiply these together and display the product.
b) Write a Program to print the area of a triangle. */

import java.util.Scanner;

public class Task_02
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("OOP Lab 01: Task no. 02: Part A");
        System.out.println();

        Scanner s = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num_1 = s.nextDouble();

        System.out.print("Enter second number: ");
        double num_2 = s.nextDouble();

        double ans = num_1 * num_2;

        System.out.println("Product of " + num_1 + " and " + num_2 + ": " + ans);
        System.out.println();

        System.out.println("OOP Lab 01: Task no. 02: Part B");
        System.out.println();

        System.out.print("Enter base of the triangle: ");
        int base =  s.nextInt();

        System.out.print("Enter height of the triangle: ");
        int height = s.nextInt();

        double area = 0.5 * base * height;

        System.out.println("Area of the triangle: " + area);
    }
}
