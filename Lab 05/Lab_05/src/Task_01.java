//Hafsa Salman
//OOP Lab 05: Task no. 01

import java.util.Scanner;

public class Task_01
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("OOP Lab 05: Task no. 01");
        System.out.println();

        Scanner s = new Scanner(System.in);

        System.out.print("Enter number of orders today: ");
        int size = s.nextInt();

        s.nextLine();

        AveragePurchase A = new AveragePurchase(size);

        System.out.println();

        A.purchases();
        A.print();
    }
}

class AveragePurchase
{
    String [] orders;
    int size;

    public AveragePurchase (int size)
    {
        this.size = size;
        orders = new String [size];
    }

    public void purchases()
    {
        Scanner s =  new Scanner(System.in);

        for (int i = 0; i < size; i++)
        {
            System.out.print("Enter order " + (i + 1) + ": ");
            orders[i] = s.nextLine();
        }
    }

    public void print()
    {
        System.out.println("\nOrders:");
        for (int i = 0; i < orders.length; i++)
        {
            System.out.println("Order " + (i + 1) + ": " + orders[i]);
        }
    }
}