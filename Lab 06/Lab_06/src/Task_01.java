//Hafsa Salman
//OOP Lab 06: Task no. 01

public class Task_01
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("OOP Lab 06: Task no. 01");
        System.out.println();

        JavaCourse J = new JavaCourse("OOP", "CL-1004", "CS Lab 02", 1);
        J.display();
    }
}

class Course
{
    protected String name;
    protected String code;
    protected String venue;
    protected int creditHours;

    public Course (String name,String code,String venue,int creditHours)
    {
        this.name = name;
        this.code = code;
        this.venue = venue;
        this.creditHours = creditHours;
    }


}

class JavaCourse extends Course
{
    protected String teacher;

    public JavaCourse(String name, String code, String venue, int creditHours)
    {
        super(name, code, venue, creditHours);
        this.teacher = "OOP Instructor";
    }

    public void display()
    {
        System.out.println("Course Name: " + name);
        System.out.println("Course Code: " + code);
        System.out.println("Class Venue: " + venue);
        System.out.println("Course Credit Hours: " + creditHours);
        System.out.println("Course Teacher: " + teacher);
        System.out.println();
    }
}