//Hafsa Salman
//OOP Lab 03: Task no. 07

import java.util.Scanner;

public class Task_07
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("OOP Lab 03: Task no. 07");
        System.out.println();

        Scanner s = new Scanner(System.in);

        managers [] man =  new managers[3];

        for (int i=0; i < 3; i++)
        {
            System.out.print("Enter Employee ID: ");
            int id = s.nextInt();

            s.nextLine();

            System.out.print("Enter Employee Name: ");
            String name = s.nextLine();

            System.out.print("Enter Employee Phone Number: ");
            String phone = s.nextLine();

            System.out.print("Enter Employee Salary: ");
            int salary = s.nextInt();

            man[i] = new managers(id, name, phone, salary);

            System.out.println();
        }

        double highestSalary = man[0].getSalary();
        String highestName = man[0].getName();

        for (int i=0; i < 3; i++)
        {
            if (man[i].getSalary() > highestSalary)
            {
                highestName = man[i].getName();
                highestSalary = man[i].getSalary();
            }
        }

        System.out.println("Printing Employees' Details: ");
        for (int i=0; i < 3; i++)
        {
            man[i].displayDetails();
        }

        System.out.println("Printing Employee with highest salary: ");
        System.out.println("Employee Name: " + highestName);
        System.out.println("Employee Salary: " + highestSalary);
    }
}

class managers
{
    public int num;
    public String name;
    public String phone;
    private double salary;

    public managers (int num, String name, String phone, double salary)
    {
        this.num = num;
        this.name = name;
        this.phone = phone;
        this.salary = salary;
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public void displayDetails()
    {
        System.out.println("Employee ID: " + num);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Phone Number: " + phone);
        System.out.println("Salary: " + salary);
        System.out.println();
    }
}