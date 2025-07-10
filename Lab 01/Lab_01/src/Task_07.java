//Hafsa Salman
//OOP Lab 01: Task no. 07
/* Write a Java program that takes as input your name, student ID, current courses registered for and displays
all the information. */

import java.util.Scanner;

public class Task_07
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("OOP Lab 01: Task no. 07");
        System.out.println();

        Scanner s =  new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = s.next();

        System.out.print("Enter Student ID: ");
        String id = s.next();

        System.out.print("Enter Courses: ");
        String course  = s.next();

        System.out.println();

        System.out.println("Displaying Information...");
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("Courses: " + course);
    }
}