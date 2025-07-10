//Hafsa Salman
//OOP Lab 05: Task no. 08

public class Task_08
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("OOP Lab 05: Task no. 08");
        System.out.println();

        BankAccount B1 = new BankAccount(123, "A", 1200);
        BankAccount B2 = new BankAccount(234, "B", 34000);
        BankAccount B3 = new BankAccount(345, "C", 5678);

        B1.displayAccount();
        B2.displayAccount();
        B3.displayAccount();

        System.out.println("Total Bank Accounts: " + BankAccount.getTotalAccounts());
    }
}

class BankAccount
{
    int accountNumber;
    String accountHolderName;
    double balance;

    static int totalAccounts = 0;

    public BankAccount (int accountNumber, String accountHolderName,  double balance)
    {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        totalAccounts++;
    }

    public static int getTotalAccounts()
    {
        return totalAccounts;
    }

    public void displayAccount()
    {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println();
    }
}