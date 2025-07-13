//Hafsa Salman
//OOP Lab 09: Task no. 04

public class Task_04
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("OOP Lab 09: Task no. 04");
        System.out.println();

        Vehicle car = new Vehicle("Suzuki", 1300, "Swift")
        {
            Owner o = new Owner("A", 1234560987, "0300-1234567");

            @Override
            public void display()
            {
                super.display();
                System.out.println("Owner's Information:");
                System.out.println("Owner Name: " + o.getOwnerName());
                System.out.println("CNIC: " + o.getCNIC());
                System.out.println("Phone Number: " + o.getNumber());
            }
        };

        car.display();
    }
}

//In main method create an object of class car using anonymous inner class and within that assign the owner to the car. The anonymous
//inner class should override the display method to show all the details of a car i.e. vehicle name, engine cc, model, Owners name and
//CNIC.

class Vehicle
{
    String name;
    int engine; //in cc
    String model;

    public Vehicle(String name, int engine, String model)
    {
        this.name = name;
        this.engine = engine;
        this.model = model;
    }

    public void display()
    {
        System.out.println("Vehicle Information: ");
        System.out.println("Name: " + name);
        System.out.println("Engine: " + engine + " cc");
        System.out.println("Model: " + model);
        System.out.println();
    }

    static class Owner
    {
        String ownerName;
        int CNIC;
        String number;

        public Owner(String ownerName, int CNIC, String number)
        {
            this.ownerName = ownerName;
            this.CNIC = CNIC;
            this.number = number;
        }

        public String getOwnerName()
        {
            return ownerName;
        }

        public int getCNIC()
        {
            return CNIC;
        }

        public String getNumber()
        {
            return number;
        }
    }
}