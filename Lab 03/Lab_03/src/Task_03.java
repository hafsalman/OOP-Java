//Hafsa Salman
//OOP Lab 03: Task no. 03

public class Task_03
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("OOP Lab 03: Task no. 03");
        System.out.println();

        Book b = new Book("Great Expectations", "Charles Dickens", 79.75);

        b.DisplayBook();
    }
}

class Book
{
    String title;
    String author;
    double price;

    public Book(String title, String author, double price)
    {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public void DisplayBook()
    {
        System.out.println("Displaying Book Details...");
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Price: " + getPrice());
    }
}