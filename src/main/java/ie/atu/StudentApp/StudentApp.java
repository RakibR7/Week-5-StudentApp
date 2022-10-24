package ie.atu.StudentApp;
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
        String name = inputs.nextLine();
        Student StudentName = new Student();
        StudentName.getName();


        System.out.println("Please enter your email: ");
        String email = inputs.nextLine();
        Student StudentEmail = new Student();
        StudentEmail.getEmail();

        System.out.println("Please enter your course: ");
        String course = inputs.nextLine();
        Student StudentCourse = new Student();
        StudentCourse.getCourse();

        String info = name + email + course;
        System.out.println("Information about student:  " + info);
    }
}
