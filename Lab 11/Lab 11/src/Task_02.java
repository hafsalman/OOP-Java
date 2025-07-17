//Hafsa Salman
//OOP Lab 11: Task no. 02

import java.io.*;
import java.util.Scanner;

public class Task_02
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("OOP Lab 11: Task no. 02");
        System.out.println();

        Scanner s =  new Scanner(System.in);

        File f = new File("HafsaSalman.txt");

        try
        {
            if(f.createNewFile())
            {
                System.out.println("File created");
            }
        }

        catch (IOException e)
        {
            throw new RuntimeException(e);
        }

        BufferedWriter bw = new BufferedWriter(new FileWriter(f));

        bw.write("Name: Hafsa Salman");
        bw.write("\nQualification: SWE Student");

        bw.close();

        BufferedReader br = new BufferedReader(new FileReader(f));

        String str;

        while ((str = br.readLine()) != null)
        {
            System.out.println(str);
        }

        br.close();
    }
}

//Create a text file whose name is your name. Write your full name and qualifications in separate lines and
//then read it to show the text present in file to console window.