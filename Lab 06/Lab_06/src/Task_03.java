//Hafsa Salman
//OOP Lab 06: Task no. 03

public class Task_03
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("OOP Lab 06: Task no. 03");
        System.out.println();

        Car C =  new Car();
        C.display();
    }
}

class Vehicle
{
    private int speed;
    private String color;
    private int wheel;

    public Vehicle()
    {
        speed = 0;
        color = "Black";
        wheel = 4;
    }

    public  Vehicle(int speed, String color, int wheel)
    {
        this.speed = speed;
        this.color = color;
        this.wheel = wheel;
    }

    public int getSpeed()
    {
        return speed;
    }

    public String getColor()
    {
        return color;
    }

    public int getWheel()
    {
        return wheel;
    }

    public void setSpeed(int speed)
    {
        this.speed = speed;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public void setWheel(int wheel)
    {
        this.wheel = wheel;
    }
}

class MotorVehicle extends Vehicle
{
    private String licensePlate;

    public MotorVehicle()
    {
        licensePlate = "MEOW - 123";
    }

    public String getLicensePlate()
    {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate)
    {
        this.licensePlate = licensePlate;
    }
}

class Car extends MotorVehicle
{
    private int doors;

    public Car()
    {
        doors = 4;
    }

    public int getDoors()
    {
        return doors;
    }

    public void setDoors(int doors)
    {
        this.doors = doors;
    }

    public void display()
    {
        System.out.println("Speed: " +  getSpeed());
        System.out.println("Color: " +  getColor());
        System.out.println("Wheel: " +  getWheel());
        System.out.println("License Plate: " +   getLicensePlate());
        System.out.println("No. of Doors: " +  getDoors());
    }
}