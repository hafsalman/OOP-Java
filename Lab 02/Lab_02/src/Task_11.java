//Hafsa Salman
//OOP Lab 02: Task no. 11
/* Write a Java method to count all vowels in a string */

import java.util.Scanner;

public class Task_11
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("OOP Lab 02: Task no. 11");
        System.out.println();

        Scanner s =  new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = s.nextLine();

        int count = 0;

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                count++;
            }
        }

        System.out.println("Total number of vowels: " + count);
    }
}