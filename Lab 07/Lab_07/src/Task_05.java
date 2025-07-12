//Hafsa Salman
//OOP Lab 07: Task no. 05

import java.util.Arrays;
import java.util.Collections;

public class Task_05
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("OOP Lab 07: Task no. 05");
        System.out.println();

        Sorting s = new Sorting();

        int[] numbers = {5, 2, 8, 1, 9};
        String[] names = {"Z", "A", "H", "S", "B"};

        System.out.println("Original int array: " + Arrays.toString(numbers));
        System.out.println("Original String array: " + Arrays.toString(names));

        System.out.println();

        s.sort(numbers.clone());
        s.sort(numbers.clone(), true);

        System.out.println();

        s.sort(names.clone());
        s.sort(names.clone(), true);
    }
}

class Sorting
{
    public void sort(int[] array)
    {
        Arrays.sort(array);

        System.out.println("Sorted int array (ascending): " + Arrays.toString(array));
    }

    public void sort(String[] array)
    {
        Arrays.sort(array);

        System.out.println("Sorted String array (ascending): " + Arrays.toString(array));
    }

    public void sort(int[] array, boolean descending)
    {
        if (descending)
        {
            Integer[] boxed = Arrays.stream(array).boxed().toArray(Integer[]::new);
            Arrays.sort(boxed, Collections.reverseOrder());

            for (int i = 0; i < array.length; i++)
            {
                array[i] = boxed[i];
            }

            System.out.println("Sorted int array (descending): " + Arrays.toString(array));
        }

        else
        {
            sort(array);
        }
    }

    public void sort(String[] array, boolean descending)
    {
        if (descending)
        {
            Arrays.sort(array, Collections.reverseOrder());
            System.out.println("Sorted String array (descending): " + Arrays.toString(array));
        }

        else
        {
            sort(array);
        }
    }
}

//Create a Java program that implements a class named "Sorting" with the following methods:
//•	sort (int[] array) sorts the given integer array in ascending order.
//•	sort(String[] array) sorts the given string array in ascending order
//•	sort (int[] array, boolean descending) sorts the given integer array in either ascending or descending order, depending on the value of the boolean parameter.
//•	sort(String[] array, boolean descending) sorts the given string array in either ascending or descending order, depending on the value of the boolean parameter.
//Create an instance of the "Sorting" class, populate some arrays with random values, and execute all four "sort" methods with appropriate arguments.