//Hafsa Salman
//OOP Lab 04: Task no. 01

import java.util.Scanner;

public class Task_01
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("OOP Lab 04: Task no. 01");
        System.out.println();

        System.out.println("Part A");
        Box B1 = new Box(5, 6);
        B1.display();

        System.out.println("Part B");
        Box B2 = new Box(5);
        B2.display();

        System.out.println("Part C");
        Box B3 = new Box();
        B3.display();
    }
}

class Box
{
    int width;
    int height;

    Scanner s = new Scanner(System.in);

    public Box(int width, int height)
    {
        this.width = width;
        this.height = height;
    }

    public Box (int height)
    {
        this.height = height;

        System.out.print("Enter width: ");
        int w = s.nextInt();
        this.width = w;
    }

    public Box()
    {
        System.out.print("Enter width: ");
        int w = s.nextInt();

        System.out.print("Enter height: ");
        int h = s.nextInt();

        this.width = w;
        this.height = h;
    }
    public void display()
    {
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println();
    }
}