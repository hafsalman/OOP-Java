//Hafsa Salman
//OOP Lab 08: Task no. 03

public class Task_03
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("OOP Lab 08: Task no. 03");
        System.out.println();

        Cats c = new Cats();
        c.cats();

        Dogs d = new Dogs();
        d.dogs();
    }
}

abstract class Animals
{
    abstract void cats();
    abstract void dogs();
}

class Cats extends Animals
{
    @Override
    void cats()
    {
        System.out.println("Cats meow.");
    }

    @Override
    void dogs()
    {
    }
}

class Dogs extends Animals
{

    @Override
    void cats()
    {
    }

    @Override
    void dogs()
    {
        System.out.println("Dogs bark.");
    }
}