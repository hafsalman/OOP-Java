//Hafsa Salman
//OOP Lab 03: Task no. 06

public class Task_06
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("OOP Lab 03: Task no. 06");
        System.out.println();

        student s = new student("Hafsa Salman", 21, "OOP in Java");

        System.out.println("My name is " + s.name + ". I am " + s.age + " years old." + " I am studying " + s.course + ".");
    }
}

class student
{
    String name;
    int age;
    String course;

    public student (String name, int age, String course)
    {
        this.name = name;
        this.age = age;
        this.course = course;
    }
}