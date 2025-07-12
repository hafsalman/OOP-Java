//Hafsa Salman
//OOP Lab 07: Task no. 04

public class Task_04
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("OOP Lab 07: Task no. 04");
        System.out.println();

        SavingAccount S = new SavingAccount(2500.0, 5);

        System.out.println("Balance: " + S.getBalance());
        System.out.println("Time Span: " + S.timeSpan + " months");

        S.credit(5000);

        System.out.println("Balance after crediting: " + S.getBalance());

        S.debit(1500);

        System.out.println("Balance after withdrawal: " + S.getBalance());
    }
}

class Accounts
{
    double balance;

    public Accounts (double balance)
    {
        this.balance = balance;
    }

    public void debit (double money)
    {
        balance -= money;
    }

    public void credit (double money)
    {
        balance += money;
    }

    public double getBalance()
    {
        return balance;
    }
}

class SavingAccount extends Accounts
{
    int timeSpan;

    public SavingAccount(double balance, int timeSpan)
    {
        super(balance);
        this.timeSpan = timeSpan;
    }

    public double calculateInterest ()
    {
        return balance * timeSpan * 0.02; //Interest Rate: 2%
    }

    @Override
    public void credit(double money)
    {
        super.credit(money);
        double interest = calculateInterest();
        balance = money + interest;
    }
}

class CheckingAccount extends Accounts
{

    public CheckingAccount(double balance)
    {
        super(balance);
    }
}