//Hafsa Salman
//OOP Lab 10: Task no. 01

import java.util.ArrayList;
import java.util.List;

public class Task_01
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("OOP Lab 10: Task no. 01");
        System.out.println();

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1213);
        list.add(80);
        list.add(3234);
        list.add(42);
        list.add(54);

        double average = calculateAverage(list);

        System.out.println("Average: " + average);
    }

    public static double calculateAverage(List<Integer> list)
    {
        try
        {
            int sum, count;

            sum = 0;
            count = 0;

            for (Integer item : list)
            {
                try
                {
                    int valid = Integer.parseInt(item.toString());

                    sum += valid;

                    count++;
                }

                catch (NumberFormatException e)
                {
                    System.out.println("Error: Invalid Input: " + item);
                }
            }

            if (count == 0)
            {
                throw new IllegalArgumentException("List contains invalid integers.");
            }

            return (double) sum / count;
        }

        catch(IllegalArgumentException e)
        {
            System.out.println("Error: Invalid Input");
        }

        return 0.0;
    }
}