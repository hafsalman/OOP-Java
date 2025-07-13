//Hafsa Salman
//OOP Lab 08: Task no. 02

public class Task_02
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("OOP Lab 08: Task no. 02");
        System.out.println();

        A a = new A(80, 78, 99);
        System.out.println("Percentage of Student A (3 subjects): " + a.getPercentage() + "%");

        B b = new B(70,89, 90, 80);
        System.out.println("Percentage of Student B (4 subjects): " + b.getPercentage() + "%");
    }
}

abstract class Marks
{
    abstract double getPercentage();
}

class A extends Marks
{
    int a, b, c;

    public A(int a, int b, int c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double getPercentage()
    {
        return ((a + b + c) * 100) / 300;
    }
}

class B extends Marks
{
    int a, b, c, d;

    public B(int a, int b, int c,  int d)
    {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    double getPercentage()
    {
        return ((a + b + c + d) * 100) / 400;
    }
}