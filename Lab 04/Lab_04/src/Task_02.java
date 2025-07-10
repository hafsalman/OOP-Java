//Hafsa Salman
//OOP Lab 04: Task no. 02

public class Task_02
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("OOP Lab 04: Task no. 02");
        System.out.println();

        meow meow = new meow();
        meow.display();

        meow m =  new meow("C");
        m.display();
    }
}

class meow
{
    String language;

    public meow ()
    {
        this.language = "JAVA";
    }

    public  meow (String language)
    {
        this.language = language;
    }

    public void display()
    {
        System.out.println("Language: " + language);
    }
}