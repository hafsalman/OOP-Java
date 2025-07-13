//Hafsa Salman
//OOP Lab 08: Task no. 04

import java.util.Scanner;

public class Task_04
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("OOP Lab 08: Task no. 04");
        System.out.println();

        Scanner s =  new Scanner(System.in);

        System.out.print("Recipient Name: ");
        String recipient = s.next();

        System.out.print("Message: ");
        String message = s.next();

        System.out.println();

        WhatsApp w  = new WhatsApp();
        w.sendMessage(message, recipient);
        w.receive(message);
    }
}

interface MessageService
{
    public void sendMessage(String message, String recipient);
    public void receive(String message);
}

class WhatsApp implements MessageService
{
    @Override
    public void sendMessage(String message, String recipient)
    {
        System.out.println("To: " + recipient);
        System.out.println("Message: " + message);
        System.out.println();
    }

    @Override
    public void receive(String message)
    {
        System.out.println("Message Received: " + message);
    }
}

// In the Main class, create an instance of WhatsApp, and ask the user to enter the message he wants to send also enter the name
// to whom he wants to send a message and print it.