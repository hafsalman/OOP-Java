//Hafsa Salman
//OOP Lab 12: Task no. 05

import java.util.Scanner;

public class Task_05 <U, P>
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("OOP Lab 12: Task no. 05");
        System.out.println();

        String username = "Hafsa";
        String password = "Hafsa123";

        Scanner s = new Scanner(System.in);

        String user, pass;

        System.out.print("Enter username: ");
        user = s.nextLine();

        System.out.print("Enter password: ");
        pass = s.nextLine();

        Task_05<String, String> login = new Task_05<>(username, password);
        login.Authentication(user, pass);
    }

    private U username;
    private P password;

    public Task_05(U username, P password)
    {
        this.username = username;
        this.password = password;
    }

    public void Authentication (U user, P pass)
    {
        if(user.equals(username) && pass.equals(password))
        {
            System.out.println("You have been logged in successfully!");
        }

        else
        {
            System.out.println("Invalid login credentials!");
        }
    }
}