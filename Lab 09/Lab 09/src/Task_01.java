//Hafsa Salman
//OOP Lab 09: Task no. 01

public class Task_01
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("OOP Lab 09: Task no. 01");
        System.out.println();

        Person P = new Person();

        System.out.println("Salary: " + P.getSalary());
    }
}

class Job
{
    private String role;
    private String id;
    private double salary;

    public String getRole()
    {
        return role;
    }

    public void setRole(String role)
    {
        this.role = role;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }
}

class Person
{
    private Job j = new Job();

    public Person()
    {
        j.setRole("SWE");
        j.setId("CS");
        j.setSalary(120000);
    }

    public double getSalary()
    {
        return j.getSalary();
    }
}