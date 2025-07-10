//Hafsa Salman
//OOP Lab 02: Task no. 03
/* Take numbers as input from user. Write a Java program to interchange the contents of both variables. */

import java.util.Scanner;

public class Task_03
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("OOP Lab 02: Task no. 03");
        System.out.println();

        Scanner s = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int num1 = s.nextInt();

        System.out.print("Enter number 2: ");
        int num2 = s.nextInt();

        System.out.println();

        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After interchanging: ");
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
    }
}