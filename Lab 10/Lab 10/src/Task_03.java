//Hafsa Salman
//OOP Lab 10: Task no. 03

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_03
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("OOP Lab 10: Task no. 03");
        System.out.println();

        Scanner s =  new Scanner(System.in);

        System.out.print("Enter Number 01: ");
        String num_01 = s.nextLine();

        System.out.print("Enter Number 02: ");
        String num_02 = s.nextLine();

        try
        {
            if (num_01 == null || num_02 == null || num_01.isEmpty() || num_02.isEmpty())
            {
                throw new IllegalArgumentException("Number should not be null or empty");
            }

            double num01 = Double.parseDouble(num_01);
            double num02 = Double.parseDouble(num_02);

            if (num02 == 0)
            {
                throw new IllegalArgumentException("Number should not be 0. (Not applicable for division)");
            }

            double add = num01 + num02;
            double sub = num01 - num02;
            double mul = num01 * num02;
            double div = num01 / num02;

            System.out.println("Addition: " + add);
            System.out.println("Subtraction: " + sub);
            System.out.println("Multiplication: " + mul);
            System.out.println("Division: " + div);
        }

        catch (ArithmeticException e)
        {
            System.out.println("Error: " + e.getMessage());
        }

        catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }
}