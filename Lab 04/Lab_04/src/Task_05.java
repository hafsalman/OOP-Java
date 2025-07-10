//Hafsa Salman
//OOP Lab 04: Task no. 05


public class Task_05
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("OOP Lab 04: Task no. 05");
        System.out.println();

        Tank tank_1 = new Tank();

        tank_1.capacity = 2;

        tank_1.fill();

        tank_1.empty();
        tank_1.empty();

        tank_1.Finalize();

        System.gc();
    }
}

class Tank
{
    int capacity;

    public void fill()
    {
        capacity++;
    }

    public void empty()
    {
        capacity--;
    }

    protected void Finalize()
    {
        if (capacity == 0)
        {
            System.out.println("Object terminated!");
        }

        else
        {
            System.out.println("Capacity: " + capacity);
        }
    }
}