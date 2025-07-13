//Hafsa Salman
//OOP Lab 08: Task no. 01

public class Task_01
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("OOP Lab 08: Task no. 01");
        System.out.println();

        BankA A =  new BankA();
        System.out.println("Balance in Bank A: " + A.getBalance());
        System.out.println();

        BankB B = new BankB();
        System.out.println("Balance in Bank B: " + B.getBalance());
        System.out.println();

        BankC C = new BankC();
        System.out.println("Balance in Bank C: " + C.getBalance());
        System.out.println();
    }
}

abstract class Bank
{
    abstract double getBalance();
}

class BankA extends Bank
{
    double balance = 100;

    @Override
    double getBalance()
    {
        return balance;
    }
}

class BankB extends Bank
{
    double balance = 150;

    @Override
    double getBalance()
    {
        return balance;
    }
}

class BankC extends Bank
{
    double balance = 200;

    @Override
    double getBalance()
    {
        return balance;
    }
}