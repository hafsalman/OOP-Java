//Hafsa Salman
//OOP Lab 12: Task no. 02

import java.util.ArrayList;
import java.util.Collections;

public class Task_02 <T>
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("OOP Lab 12: Task no. 02");
        System.out.println();

        Task_02<Object> Stack = new Task_02<>();

        Stack.Push(5);
        Stack.Push(15);
        Stack.Push(10);

        System.out.println("Printing Stack: ");
        Stack.display();

        ArrayList<Integer> sortedIntegerArray = Stack.AddAndSort();
        System.out.println("Sorted Array: " + sortedIntegerArray);

        Stack.Push("Hafsa");
        Stack.Push("Salman");

        Stack.display();

        System.out.println("Size of stack: " + Stack.size());
    }

    private ArrayList<T> list;

    public Task_02()
    {
        this.list = new ArrayList<>();
    }

    public boolean isEmpty()
    {
        return list.isEmpty();
    }

    public int size()
    {
        return list.size();
    }

    public void Push(T element)
    {
        list.add(element);
    }

    public T Pop()
    {
        if (isEmpty())
        {
            return null;
        }

        return list.remove(list.size() - 1);
    }

    public T Peek()
    {
        if (isEmpty())
        {
            return null;
        }

        return list.get(list.size() - 1);
    }

    public ArrayList<Integer> AddAndSort()
    {
        ArrayList<Integer> integerData = new ArrayList<>();
        ArrayList<Integer> sortedIntegerArray = new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--)
        {
            Object element = list.get(i);

            if (element instanceof Integer)
            {
                integerData.add((Integer) element);
            }
        }

        Collections.sort(integerData, Collections.reverseOrder());

        for (Integer num : integerData)
        {
            sortedIntegerArray.add(num);
        }

        return sortedIntegerArray;
    }

    public void display()
    {
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }
}