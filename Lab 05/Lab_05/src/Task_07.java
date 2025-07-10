//Hafsa Salman
//OOP Lab 05: Task no. 07

public class Task_07
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("OOP Lab 05: Task no. 07");
        System.out.println();

        Person P = new Person("Meow");

        System.out.println("Printing Name: " + P.getFullName());
    }
}

class Person
{
    private final String FullName;

    public String getFullName()
    {
        return FullName;
    }

    public Person(String fullName)
    {
        this.FullName = fullName;
    }
}