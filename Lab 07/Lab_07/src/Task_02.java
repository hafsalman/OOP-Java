//Hafsa Salman
//OOP Lab 07: Task no. 02

public class Task_02
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("OOP Lab 07: Task no. 02");
        System.out.println();

        Person P = new Person("ABC", "abc@gmail.com", "123456789");
        System.out.println(P.toString());
        System.out.println();

        Student S = new Student("Hafsa Salman", "hafsa@gmail.com", "123456789", "123", "SE", 3.5);
        System.out.println(S.toString());
        System.out.println();

        Faculty F = new Faculty("XYZ", "xyz@gmail.com", "123456789", "123", "SE", "Professor");
        System.out.println(F.toString());
        System.out.println();

        Staff s = new Staff("LMN", "lmn@gmail.com", "123456789", "456", "Electrician", 35000);
        System.out.println(s.toString());
    }
}

class Person
{
    String name;
    String email;
    String phone;

    public  Person(String name, String email, String phone)
    {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String toString()
    {
        return "Name: " + name + "\nEmail: " + email + "\nPhone: " + phone;
    }
}

class Student extends Person
{
    String StudentID;
    String major;
    double GPA;


    public Student(String name, String email, String phone,  String StudentID, String major,  double GPA)
    {
        super(name, email, phone);
        this.StudentID = StudentID;
        this.major = major;
        this.GPA = GPA;
    }

    public double getGPA()
    {
        return GPA;
    }

    @Override
    public String toString()
    {
        return super.toString() +  "\nStudentID: " + StudentID + "\nGPA: " + getGPA();
    }
}

class Faculty extends Person
{
    String FacultyID;
    String Department;
    String rank;

    public Faculty(String name, String email, String phone, String FacultyID, String Department, String rank)
    {
        super(name, email, phone);
        this.FacultyID = FacultyID;
        this.Department = Department;
        this.rank = rank;
    }

    public String getRank()
    {
        return rank;
    }

    @Override
    public String toString()
    {
        return super.toString() +   "\nFacultyID: " + FacultyID + "\nDepartment: " + Department + "\nRank: " + getRank();
    }
}

class Staff extends Person
{
    String StaffID;
    String jobTitle;
    double salary;


    public Staff(String name, String email, String phone,  String StaffID, String jobTitle, double salary)
    {
        super(name, email, phone);
        this.StaffID = StaffID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public double getSalary()
    {
        return salary;
    }

    @Override
    public String toString()
    {
        return super.toString() + "\nStaff ID: " +  StaffID + "\nJob Title: " + jobTitle + "\nSalary: " + getSalary();
    }
}