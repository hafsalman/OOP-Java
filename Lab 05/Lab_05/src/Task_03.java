//Hafsa Salman
//OOP Lab 05: Task no. 03

import java.util.ArrayList;

public class Task_03
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("OOP Lab 05: Task no. 03");
        System.out.println();

        ArrayList <String> language = new ArrayList <String>();

        language.add("Java");
        language.add("C#");
        language.add("Python");
        language.add("PHP");
        language.add("JavaScript");

        System.out.println("Printing Languages");
        System.out.println(language);

        System.out.println();

        System.out.println("Changing Second Index: ");
        language.set(1, "C");
        System.out.println(language);
    }
}