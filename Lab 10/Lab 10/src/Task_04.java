//Hafsa Salman
//OOP Lab 10: Task no. 04

import java.util.Scanner;

public class Task_04
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("OOP Lab 10: Task no. 04");
        System.out.println();

        Scanner s =  new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = s.nextLine();

        try
        {
            int count = 0;

            if (str == null || str.isEmpty())
            {
                throw new IllegalArgumentException("String should not be null or empty");
            }

            String [] words = str.trim().split("\\s+");

            if (words.length < 2)
            {
                throw new IllegalArgumentException("Sentence should be more than 2 words.");
            }

            words[0] = words[0].toLowerCase();
            words[1] = words[1].toUpperCase();

            StringBuilder mod = new StringBuilder();

            for (String w : words)
            {
                mod.append(w).append(" ");
            }

            System.out.println("Modified String: " + mod);
        }

        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}