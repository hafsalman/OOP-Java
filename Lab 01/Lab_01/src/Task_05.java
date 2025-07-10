//Hafsa Salman
//OOP Lab 01: Task no. 05
/* Write a Java program that inputs three integers from the user and displays the sum, average, and product of these numbers. */

import java.util.Scanner;

public class Task_05
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("OOP Lab 01: Task no. 05");
        System.out.println();

        Scanner s = new Scanner(System.in);

        System.out.print("Enter number 01: ");
        int num_01 = s.nextInt();

        System.out.print("Enter number 02: ");
        int num_02 = s.nextInt();

        System.out.print("Enter number 03: ");
        int num_03 = s.nextInt();

        System.out.println();

        int sum =  num_01 + num_02 + num_03;
        int product = num_01 * num_02 * num_03;
        double avg = sum / 3;

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Average: " + avg);
    }
}