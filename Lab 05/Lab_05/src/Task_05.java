//Hafsa Salman
//OOP Lab 05: Task no. 05

public class Task_05
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("OOP Lab 05: Task no. 05");
        System.out.println();

        circle c = new circle(65);

        System.out.println("Radius: " + c.radius);
        System.out.println("Area: " + c.calculateArea());
        System.out.println("Circumference: " + c.calculateCircumference());
    }
}

class circle
{
    final double pi = 3.14159;
    final double radius;

    public circle (double radius)
    {
        this.radius = radius;
    }

    public double calculateArea()
    {
        return pi * radius * radius;
    }

    public double calculateCircumference()
    {
        return 2 * pi *  radius;
    }
}