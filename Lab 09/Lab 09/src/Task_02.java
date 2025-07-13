//Hafsa Salman
//OOP Lab 09: Task no. 02

public class Task_02
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("OOP Lab 09: Task no. 02");
        System.out.println();

        House H =  new House("Bungalow");
        H.Display();
    }
}

class House
{
    String type;

    class Room
    {
        private String roomType;
        private int roomSize;
        private double roomTemp;

        public String getRoomType()
        {
            return roomType;
        }

        public int getRoomSize()
        {
            return roomSize;
        }

        public double getRoomTemp()
        {
            return roomTemp;
        }

        public void setRoomType(String roomType)
        {
            this.roomType = roomType;
        }

        public void setRoomSize(int roomSize)
        {
            this.roomSize = roomSize;
        }

        public void setRoomTemp(double roomTemp)
        {
            this.roomTemp = roomTemp;
        }
    }

    Room R = new Room();

    public House (String type)
    {
        this.type = type;
        R.setRoomType("Living Room");
        R.setRoomSize(450);
        R.setRoomTemp(25.5);
    }

    public void Display()
    {
        System.out.println("House Type: " + type);
        System.out.println("Room Type: " + R.getRoomType());
        System.out.println("Room Size: " + R.getRoomSize());
        System.out.println("Room Temperature: " + R.getRoomTemp());
    }
}