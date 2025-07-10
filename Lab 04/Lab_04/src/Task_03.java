//Hafsa Salman
//OOP Lab 04: Task no. 03

public class Task_03
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("OOP Lab 04: Task no. 03");
        System.out.println();

        Holiday H1 = new Holiday("Labour Day", 1, "May");
        Holiday H2 = new Holiday("Independence Day", 14, "August");
        Holiday H3 = new Holiday();

        H1.print();
        H2.print();

        System.out.println("Same month: " + H3.isSameMonth(H1.month, H2.month));
    }
}

class Holiday
{
    String name;
    int day;
    String month;

    public Holiday()
    {

    }

    public Holiday(String name, int day, String month)
    {
        this.name = name;
        this.day = day;
        this.month = month;
    }

    public void print()
    {
        System.out.println("Name: " + name);
        System.out.println("Day: " + day);
        System.out.println("Month: " + month);
        System.out.println();
    }

    public boolean isSameMonth(String month, String m)
    {
        if (month.equals(m))
        {
            return true;
        }

        return false;
    }
}