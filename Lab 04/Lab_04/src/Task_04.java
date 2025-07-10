//Hafsa Salman
//OOP Lab 04: Task no. 04

public class Task_04
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("OOP Lab 04: Task no. 04");
        System.out.println();

        holiday h1 = new holiday("Independence Day", 14, "August");
        holiday h2 = new holiday(h1);

        h1.print();
        h2.print();
    }
}

class holiday
{
    String name;
    int day;
    String month;

    public holiday(String name, int day, String month)
    {
        this.name = name;
        this.day = day;
        this.month = month;
    }

    public holiday (holiday h)
    {
        this.name = h.name;
        this.day = h.day;
        this.month = h.month;
    }

    public void print()
    {
        System.out.println("Name: " + name);
        System.out.println("Day: " + day);
        System.out.println("Month: " + month);
        System.out.println();
    }
}