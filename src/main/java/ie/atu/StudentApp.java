package ie.atu;
import java.util.Scanner;

public class StudentApp
{

    public static void main(String[] args)
    {
        Student_1();
    }

    public static void Student_1()
    {
        System.out.println("Please enter your name: ");
        Scanner inputs = new Scanner(System.in);
        String name_1 = inputs.nextLine();

        System.out.println("Please enter your email: ");
        //Scanner input = new Scanner(System.in);
        String email_1 = inputs.nextLine();

        System.out.println("Please enter your course: ");
        //Scanner inputs = new Scanner(System.in);
        String course_1 = inputs.nextLine();

        String info = name_1 + email_1 + course_1;
        System.out.println("Information about student:  " + info);
    }
}
