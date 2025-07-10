//Hafsa Salman
//OOP Lab 03: Task no. 04

public class Task_04
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("OOP Lab 03: Task no. 04");
        System.out.println();

        Employee E1 = new Employee("A", "B", -1200);
        Employee E2 = new Employee("C", "D", 1200);

        E1.displayEmployeeDetails();
        E2.displayEmployeeDetails();
    }
}

class Employee
{
    String firstName;
    String lastName;
    double salary;

    public Employee(String firstName, String lastName, double salary)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        if (salary < 0)
        {
            this.salary = 0;
        }

        else
        {
            this.salary = salary;
        }
    }

    public void displayEmployeeDetails()
    {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Salary: " + salary);
        System.out.println("After 10% increase...");
        System.out.println("Salary: " + (salary + (salary * 0.10)));
        System.out.println();
    }
}