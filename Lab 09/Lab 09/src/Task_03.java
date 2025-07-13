//Hafsa Salman
//OOP Lab 09: Task no. 03

public class Task_03
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("OOP Lab 09: Task no. 03");
        System.out.println();

        CPU cpu = new CPU();

        CPU.Processor p = cpu.new Processor();
        System.out.println("Cache: " + p.getCache());

        CPU.Processor.RAM r = p.new RAM();
        System.out.println("Clock Speed: " + r.getClockSpeed());
    }
}

class CPU
{
    double price;

    class Processor
    {
        double cores;
        String manufacturer;

        public double getCache()
        {
            return 4.2;
        }

        class RAM
        {
            double memory;
            String manufacturer;

            public double getClockSpeed()
            {
                return 5.3;
            }
        }
    }
}

//•	In the main program, create objects of the outer class as well as both the inner classes. Call both the functions.