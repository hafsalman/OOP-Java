//Hafsa Salman
//OOP Lab 07: Task no. 03

import java.util.Scanner;

public class Task_03
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("OOP Lab 07: Task no. 03");
        System.out.println();

        Robot R = new Robot(3, 5, 'N');
        R.initialPosition();

        MovingRobot M = new MovingRobot(3, 5, 'N');
        M.moveRobot(10, 'S');
    }
}

class Robot
{
    int x, y;
    char distance;

    public Robot(int x, int y, char distance)
    {
        this.x = x;
        this.y = y;
        this.distance = Character.toUpperCase(distance);
    }

    public void initialPosition()
    {
        System.out.println("Initial position:");
        System.out.println("X: " + x);
        System.out.println("Y: " + y);
        System.out.println("Direction: " + distance);
        System.out.println();
    }
}

class MovingRobot extends Robot
{

    public MovingRobot(int x, int y, char distance)
    {
        super(x, y, distance);
    }

    public void moveRobot(int steps, char direction)
    {
        switch (direction)
        {
            case 'N', 'n':
            {
                y += steps;

                break;
            }

            case 'S', 's':
            {
                y -= steps;

                break;
            }

            case 'E', 'e':
            {
                x += steps;

                break;
            }

            case 'W', 'w':
            {
                x -= steps;

                break;
            }

            default:
            {
                System.out.println("Invalid direction");

                break;
            }
        }

        System.out.println("Updated Position: ");
        System.out.println("X: " + x);
        System.out.println("Y: " + y);
    }
}

//•	This class have a function named moveRobot; function will take steps to move as argument and move robot in that direction.
//For example, if initially the direction = N and Y = 2, and user entered the steps=3, so after movement the updated coordinates are;
// Y = 5. (Since moving in North will update the +Y in Quadrant System)

//•	Create a display method to show the updated X and Y coordinates.