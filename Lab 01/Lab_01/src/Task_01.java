//Hafsa Salman
//Lab 01: Task 01
/* Write a program that calculates how long it takes to drive from Karachi to Lahore at 75 mile per hour
(Use 3000 miles as the approximate distance between two cities). */

public class Task_01
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("OOP Lab 01: Task no. 01");
        System.out.println();

        System.out.println("Distance from Karachi to Lahore: 3000 Miles");
        System.out.println("Speed: 75 mile per hour");
        System.out.println();

        int distance = 3000;
        int speed = 75;

        int time = distance/speed;

        System.out.println("Calculating Time...");
        System.out.println("Time: " + time + " hours");
    }
}