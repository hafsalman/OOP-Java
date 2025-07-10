//Hafsa Salman
//OOP Lab 06: Task no. 02

import java.util.Scanner;

public class Task_02
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("OOP Lab 06: Task no. 02");
        System.out.println();

        Manager M = new Manager();
        M.insert();
        M.E_insert();
        M.M_insert();

        M.display();
        M.E_display();
        M.M_display();
    }
}

class Person
{
    String name;
    int age;
    String nationality;
    String address;
    String CNIC;

    public Person()
    {
        System.out.println("I am a person.");
    }

    public void insert()
    {
        Scanner s = new Scanner(System.in);

        System.out.print("\nEnter name: ");
        name = s.nextLine();

        System.out.print("Enter age: ");
        age = s.nextInt();

        s.nextLine();

        System.out.print("Enter nationality: ");
        nationality = s.nextLine();

        System.out.print("Enter address: ");
        address = s.nextLine();

        do
        {
            System.out.print("Enter CNIC (without -): ");
            CNIC = s.nextLine();

            if (CNIC.length() != 13)
            {
                System.out.println("Invalid CNIC");
            }
        } while (CNIC.length() != 13);

        System.out.println();
    }

    public void  display()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Nationality: " + nationality);
        System.out.println("Address: " + address);
        System.out.println("CNIC: " + CNIC);
        System.out.println();
    }
}

class Employee extends Person
{
    String companyName;
    String companyLocation;
    int years;

    public Employee ()
    {
        System.out.println("I am an Employee.");
    }

    public void E_insert()
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Company Name: ");
        companyName = s.nextLine();

        System.out.print("Enter Company Location: ");
        companyLocation = s.nextLine();

        System.out.print("Enter Years: ");
        years = s.nextInt();

        s.nextLine();

        System.out.println();
    }

    public void E_display()
    {
        System.out.println("Company Name: " + companyName);
        System.out.println("Company Location: " + companyLocation);
        System.out.println("No. of Years Worked: " + years);
    }
}

class Manager extends Employee
{
    String [] emp = new String[5];

    public Manager ()
    {
        System.out.println("I am a Manager.");
    }

    public void M_insert()
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Input Employees working Under the Manager: ");
        for (int i=0; i<5; i++)
        {
            System.out.print("Employee " + (i+1) + ": ");
            emp[i] = s.nextLine();
        }

        System.out.println();
    }

    public void M_display()
    {
        System.out.println("\nEmployees working under the Manager: ");
        for (int i=0; i<5; i++)
        {
            System.out.println("Employee " + (i+1) + ": " +  emp[i]);
        }
    }
}