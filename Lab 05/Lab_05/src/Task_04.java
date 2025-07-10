//Hafsa Salman
//OOP Lab 05: Task no. 04

public class Task_04
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("OOP Lab 05: Task no. 04");
        System.out.println();

        Student s1 = new Student("Hafsa Salman");
        s1.setUniversityName("FAST University");
        s1.displayStudent();

        Student s2 = new Student("Dania Zehra");
        s2.setUniversityName("FAST University");
        s2.displayStudent();

        Student s3 = new Student("Amna Mansoor");
        s3.setUniversityName("FAST University");
        s3.displayStudent();
    }
}

class Student
{
    String name;
    int roll;
    static String uni;
    static int counter = 0;

    public Student(String name)
    {
        this.name = name;
        this.roll = setRoll();
    }

    public static int setRoll()
    {
        counter++;

        return counter;
    }

    public static void setUniversityName(String u_name)
    {
        uni =  u_name;
    }

    public void displayStudent()
    {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("University Name: " + uni);
        System.out.println();
    }
}