//Hafsa Salman
//OOP Lab 02: Task no. 01
/* Body Mass Index (BMI) Calculator: Body Mass Index (BMI) is a person's weight in kilograms divided by the square of height in meters. Formula given for reference.
BMI=(Weight in Kg)/[height in Metres]^2
Create a BMI calculator application that reads the user’s weight in kilograms and height in meters, then calculates and displays the user’s body mass index. The program should ask the user to input values at run-time. Also, the application should display the following information so the user can evaluate his/her BMI:
Input: weight in Kg, height in meters
Output: given below in tabular form
Less than 18.5 -> Underweight
18.5 – 24.9	-> Normal
25 – 29.9 -> Overweight
30 or above -> Obese
 */

import java.util.Scanner;

public class Task_01
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("OOP Lab 02: Task no. 01");
        System.out.println();

        Scanner s =  new Scanner(System.in);

        System.out.print("Enter weight (in kg): ");
        double weight = s.nextDouble();

        System.out.print("Enter height (in meters): ");
        double height = s.nextDouble();

        System.out.println();

        double BMI = weight / (height * height);

        System.out.println("BMI: " + BMI);

        if (BMI < 18.5)
        {
            System.out.println("Underweight");
        }

        else if (BMI >= 18.5 && BMI < 25)
        {
            System.out.println("Normal");
        }

        else if (BMI >= 25 && BMI < 30)
        {
            System.out.println("Overweight");
        }

        else
        {
            System.out.println("Obese");
        }
    }
}