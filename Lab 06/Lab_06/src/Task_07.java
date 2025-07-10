//Hafsa Salman
//OOP Lab 06: Task no. 07

public class Task_07
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("OOP Lab 06: Task no. 07");
        System.out.println();

        Category1 C = new Category1(1, "Learning Java","ABC", 12.9, "Java");
        Category1 C2 = new Category1(2, "How to Java","DEF", 42, "Java");
        Category1 C3 = new Category1(3, "Roadmap to Java","GHI", 3.9, "Java");

        System.out.println("Printing...");

        C.display();
        C2.display();
        C3.display();
    }
}

class Books
{
    protected int id;
    protected String Name;
    protected String Author;
    protected double Price;

    public Books(int id, String Name, String Author, double Price)
    {
        this.id = id;
        this.Name = Name;
        this.Author = Author;
        this.Price = Price;
    }
}

class Category1 extends Books
{
    String Category;

    public Category1(int id, String Name, String Author, double Price,  String Category)
    {
        super(id, Name, Author, Price);
        this.Category = Category;
    }

    public void display()
    {
        System.out.println("Book Name: " + Name);
        System.out.println("Book Author: " + Author);
        System.out.println("Book Price: " + Price);
        System.out.println("Category: " + Category);
        System.out.println();
    }
}