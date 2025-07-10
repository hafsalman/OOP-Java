//Hafsa Salman
//OOP Lab 01: Task no, 06
/* Write a Java program that inputs from the user the radius of a circle as an integer and prints the circle’s
diameter, circumference and area using the floating-point value 3.14159 for π. */

import java.util.Scanner;

public class Task_06
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("OOP Lab 01: Task no. 06");
        System.out.println();

        Scanner s =  new Scanner(System.in);

        System.out.print("Enter radius: ");
        int r =  s.nextInt();

        System.out.println();

        float pi = 3.14159f;

        double diameter = 2 * r;
        double circumference = 2 * pi * r;
        double area = 2 * r * r;

        System.out.println("Diameter: " + diameter);
        System.out.println("Circumference: " + circumference);
        System.out.println("Area: " + area);
    }
}