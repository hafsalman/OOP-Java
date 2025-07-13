//Hafsa Salman
//OOP Lab 09: Task no. 05

public class Task_05
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("OOP Lab 09: Task no. 05");
        System.out.println();

        Car C = new Car("Mehran", "3T");
        Car.Engine E = C.new Engine();

        System.out.println("Car Name: " + C.getCarName());
        System.out.println("Engine Type: " + E.getEngineType());
    }
}

class Car
{
    String carName;
    String carType;

    public Car (String carName, String carType)
    {
        this.carName = carName;
        this.carType = carType;
    }

    public String getCarName()
    {
        return carName;
    }

    class Engine
    {
        String engineType;

        public String setEngineType()
        {
            if (carType.equals("4T"))
            {
                if (carName.equals("Mehran"))
                {
                    this.engineType = "Small";
                }

                else
                {
                    this.engineType = "Large";
                }
            }

            else
            {
                this.engineType = "Bigger";
            }

            return engineType;
        }

        public String getEngineType()
        {
            return setEngineType();
        }
    }
}

//•	In the main program, create objects of the outer class as well as for the inner class. Call the functions as appropriate.