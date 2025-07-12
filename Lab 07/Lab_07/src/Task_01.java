//Hafsa Salman
//OOP Lab 07: Task no. 01

public class Task_01
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("OOP Lab 07: Task no. 01");
        System.out.println();

        Item I = new Item("Murder in the family", "Cara Hunter", 2023);
        System.out.println(I.toString());
        System.out.println();

        Book B = new Book("Thinking in JAVA", "Bruce Eckel", 1998,
                "Prentice Hall", "563");
        System.out.println(B.toString());
        System.out.println();

        Magazine M = new Magazine("Fast Monthly", "Students", 2023, "FAST", "8956");
        System.out.println(M.toString());
        System.out.println();

        DVD D = new DVD("History", "Historians", 2006, 65, "A.B Cannon");
        System.out.println(D.toString());
    }
}

class Item
{
    String title;
    String author;
    int year;

    public Item(String title, String author, int year)
    {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String toString()
    {
        return "Title: " + title + "\nAuthor: " + author + "\nYear: " + year;
    }
}

class Book extends Item
{
    String publisher;
    String ISBN;

    public Book(String title, String author, int year, String publisher, String ISBN)
    {
        super(title, author, year);
        this.publisher = publisher;
        this.ISBN = ISBN;
    }

    @Override
    public String toString()
    {
        return super.toString() + "\nPublisher: " + publisher + "\nISBN: " + ISBN;
    }
}


class Magazine extends Item
{
    String publisher;
    String issueNumber;

    public Magazine(String title, String author, int year,  String publisher, String issueNumber)
    {
        super(title, author, year);
        this.publisher = publisher;
        this.issueNumber = issueNumber;
    }

    @Override
    public String toString()
    {
        return super.toString() +  "\nPublisher: " + publisher + "\nIssue Number: " + issueNumber;
    }
}

class DVD extends  Item
{
    String director;
    int length;

    public DVD(String title, String author, int year, int length, String director)
    {
        super(title, author, year);
        this.director = director;
        this.length = length;
    }

    @Override
    public String toString()
    {
        return super.toString() +   "\nDirector: " + director + "\nLength: " + length + " minutes";
    }
}