//Hafsa Salman
//OOP Lab 11: Task no. 01

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Task_01
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("OOP Lab 11: Task no. 01");
        System.out.println();

        Scanner s =  new Scanner(System.in);

        File f = new File ("C:\\Users\\STMINC\\Desktop\\OOP - JAVA\\Lab 11\\Lab 11\\src\\Task_01.txt");

        try
        {
            if (f.createNewFile())
            {
                System.out.println("File created!");
            }
        }

        catch (IOException e)
        {
            throw new RuntimeException(e);
        }

        ArrayList<Integer> num = new ArrayList<Integer>();

        System.out.println("Enter 5 numbers: ");

        BufferedWriter bw = new BufferedWriter(new FileWriter(f));

        for (int i=0; i<5; i++)
        {
            System.out.print("Element " + (i+1) + ": ");
            num.add(s.nextInt());

            bw.write(String.valueOf(num.get(i)));
        }

        bw.close();

        System.out.println("\nPrinting...");

        BufferedReader br = new BufferedReader(new FileReader(f));

        System.out.println(br.readLine());

        br.close();
    }
}