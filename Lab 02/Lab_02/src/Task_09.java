//Hafsa Salman
//OOP Lab 02: Task no. 09
/* Program to copy all elements of one array into another array & find frequency of each element. */

import java.util.Scanner;

public class Task_09
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("OOP Lab 02: Task no. 09");
        System.out.println();

        Scanner s =  new Scanner(System.in);

        int size;

        System.out.print("Enter the size of the array: ");
        size = s.nextInt();

        int [] numbers  = new int [size];
        int [] copy  = new int [size];

        for (int i = 0; i < size; i++)
        {
            System.out.print("Enter number " + (i+1) + ": ");
            numbers[i] = s.nextInt();
            copy[i] = numbers[i];
        }

        int[] freq = new int[size];
        int visited = -1;

        for (int i = 0; i < size; i++)
        {
            int count = 1;
            if (freq[i] == visited)
            {
                continue;
            }

            for (int j = i + 1; j < size; j++)
            {
                if (numbers[i] == numbers[j])
                {
                    count++;
                    freq[j] = visited;
                }
            }

            freq[i] = count;
        }

        System.out.println();
        System.out.println("Printing copied array: ");
        for (int num : copy)
        {
            System.out.print(num + " ");
        }

        System.out.println();
        System.out.println("Frequency of each element:");
        for (int i = 0; i < size; i++)
        {
            if (freq[i] != visited)
            {
                System.out.println(numbers[i] + " occurs " + freq[i] + " times");
            }
        }
    }
}