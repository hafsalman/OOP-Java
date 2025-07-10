//Hafsa Salman
//OOP Lab 05: Task no. 02

import java.util.Scanner;

public class Task_02
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("OOP Lab 05: Task no. 02");
        System.out.println();

        marks m = new marks();
        m.insert();

        System.out.println();

        System.out.println("Maximum Marks: " + m.max());
        System.out.println("Minimum Marks: " + m.min());
        System.out.println("Average Marks: " + m.avg());
    }
}

class marks
{
    int [] mark = new int [5];

    public void insert()
    {
        for (int i=0; i<mark.length; i++)
        {
            Scanner s = new Scanner(System.in);

            System.out.print("Enter marks of course " + (i+1) + ": ");
            mark[i] = s.nextInt();
        }
    }

    public int max()
    {
        int max = mark[0];

        for (int i=0; i<mark.length; i++)
        {
            if (mark[i] > max)
            {
                max = mark[i];
            }
        }

        return max;
    }

    public int min()
    {
        int min = mark[0];

        for (int i=0; i<mark.length; i++)
        {
            if (mark[i] < min)
            {
                min = mark[i];
            }
        }

        return min;
    }

    public double avg()
    {
        int sum = 0;
        double average;

        for (int i=0; i<mark.length; i++)
        {
            sum += mark[i];
        }

        average = sum/mark.length;

        return average;
    }
}