//Hafsa Salman
//OOP Lab 02: Task no. 05
/* Write a program which calculates the grace marks for a student in Object oriented programming course using switch
case. The user should enter the grade obtained by the student and the number of assignments he has failed in.
•	If the student gets A grade and the number of assignments, he failed in is greater than 3, then he does not get
any grace. If the number of assignments he failed in is less than or equal to 3 then the grace is of 5 marks.

•	If the student gets B grade and the number of assignments, he failed in is greater than 2, then he does not get
any grace. If the number of assignments he failed in is less than or equal to 2 then the grace is of 4 marks.

•	If the student gets C grade and the number of assignments, he failed in is greater than 1, then he does not get
any grace. If the number of assignments he failed in is equal to 1, then the grace is of 5.
Display the appropriate output in each case.
 */

import java.util.Scanner;

public class Task_05
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("OOP Lab 02: Task no. 05");
        System.out.println();

        Scanner s =  new Scanner(System.in);

        System.out.print("Enter Grade: ");
        char grade = s.next().charAt(0);

        switch (grade)
        {
            case 'A' ->
            {
                System.out.print("Enter no. of assignments failed: ");
                int assignments = s.nextInt();

                if (assignments > 3)
                {
                    System.out.println("No grace marks.");
                }

                else
                {
                    System.out.println("Grace marks: 5 marks");
                }

                break;
            }

            case 'B' ->
            {
                System.out.print("Enter no. of assignments failed: ");
                int assignments = s.nextInt();

                if (assignments > 2)
                {
                    System.out.println("No grace marks.");
                }

                else
                {
                    System.out.println("Grace marks: 4 marks");
                }

                break;
            }

            case 'C' ->
            {
                System.out.print("Enter no. of assignments failed: ");
                int assignments = s.nextInt();

                if (assignments > 1)
                {
                    System.out.println("No grace marks.");
                }

                else
                {
                    System.out.println("Grace marks: 5 marks");
                }

                break;
            }

            default ->
            {
                System.out.println("No grace marks.");
            }
        }
    }
}