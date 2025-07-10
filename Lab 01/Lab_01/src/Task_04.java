//Hafsa Salman
//OOP Lab 01: Task no. 04
/* Write a Java program that prints all real solutions to the quadratic equation
ax2 + bx + c = 0. Read in a, b, c and use the quadratic formula.  */

import java.util.Scanner;

public class Task_04
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("OOP Lab 01: Task no. 04");
        System.out.println();

        Scanner s  = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = s.nextInt();

        System.out.print("Enter b: ");
        int b = s.nextInt();

        System.out.print("Enter c: ");
        int c = s.nextInt();

        System.out.println();

        double d = (b * b) - (4 * a * c);

        if (d > 0)
        {
            double x = (-b + Math.sqrt(d)) / (2 * a);
            double y = (-b - Math.sqrt(d)) / (2 * a);

            System.out.println("Real solutions: ");
            System.out.println("X: " + x);
            System.out.println("Y: " + y);
        }

        else if (d == 0)
        {
            double x = (-b + Math.sqrt(d)) / (2 * a);

            System.out.println("Real solutions: ");
            System.out.println("X: " + x);
        }

        else
        {
            System.out.println("No real solutions.");
        }
    }
}
