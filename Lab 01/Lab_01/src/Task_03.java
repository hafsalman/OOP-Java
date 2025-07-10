//Hafsa Salman
//OOP Lab 01: Task no. 02
/* Write a Java program that works as a simple calculator for the +, -,*, / operations. Take two integer numbers from the user and
perform all the four operations. */

import java.util.Scanner;

public class Task_03
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("OOP Lab 01: Task no. 03");
        System.out.println();

        Scanner s = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num_1 = s.nextInt();

        System.out.print("Enter second number: ");
        int num_2 = s.nextInt();

        int add =  num_1 + num_2;
        int sub = num_1 - num_2;
        int mul = num_1 * num_2;
        double div = num_2 / num_1;

        System.out.println("Addition: " + add);
        System.out.println("Subtraction: " + sub);
        System.out.println("Multiplication: " + mul);
        System.out.println("Division: " + div);
    }
}