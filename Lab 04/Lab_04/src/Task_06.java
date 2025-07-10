//Hafsa Salman
//OOP Lab 04: Task no. 06

public class Task_06
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("OOP Lab 04: Task no. 06");
        System.out.println();

        Car car = new Car("Toyota", 12000, "Black", 130);

        car.outputDetails();

        System.out.println("Price (after use): " + car.getPriceAfterUse());
        System.out.println("Update Millage: " + car.updateMillage(car.odometer, 146));
    }
}

class Car
{
    String brandName;
    double price;
    String color;
    double odometer;

    public Car(String brandName, double price, String color, double odometer)
    {
        this.brandName = brandName;
        this.price = price;
        this.color = color;
        this.odometer = odometer;
    }

    public double getPriceAfterUse()
    {
        double usePrice = price * (1 - (odometer / 600000));

        return usePrice;
    }

    public double updateMillage (double odometer, double travelledDistance)
    {
        odometer += travelledDistance;

        return odometer;
    }

    public void outputDetails()
    {
        System.out.println("Brand: " + brandName);
        System.out.println("Price (brand new car price): " + price);
        System.out.println("Color: " + color);
        System.out.println("Odometer: " + odometer);
    }
}