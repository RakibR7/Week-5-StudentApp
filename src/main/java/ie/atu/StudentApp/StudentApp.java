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
        //first instance of student information
        System.out.println("Please enter your name: ");
        Scanner inputs = new Scanner(System.in);
        String name = inputs.nextLine();
        Student StudentName = new Student();
        StudentName.setName(name);
        System.out.println("You entered: " + name);

        System.out.println("Please enter your email: ");
        String email = inputs.nextLine();
        Student StudentEmail = new Student();
        StudentEmail.setEmail(email);
        System.out.println("You entered: " + email);

        System.out.println("Please enter your course: ");
        Student StudentCourse = new Student();
        String course = inputs.nextLine();
        StudentCourse.setCourse(course);
        System.out.println("You entered: " + course);



        //second instance of student information
        System.out.println("Please enter your name: ");
        String name2 = inputs.nextLine();
        Student StudentName2 = new Student();
        StudentName2.setName(name2);
        System.out.println("You entered: " + name2);

        System.out.println("Please enter your email: ");
        String email2 = inputs.nextLine();
        Student StudentEmail2 = new Student();
        StudentEmail2.setEmail(email2);
        System.out.println("You entered: " + email2);

        System.out.println("Please enter your course: ");
        String course2 = inputs.nextLine();
        Student StudentCourse2 = new Student();
        StudentCourse2.setCourse(course2);
        System.out.println("You entered: " + course2);

        //third instance of student information
        System.out.println("Please enter your name: ");
        String name3 = inputs.nextLine();
        Student StudentName3 = new Student();
        System.out.println("You entered: " + name3);
        StudentName3.setName(name3);

        System.out.println("Please enter your email: ");
        String email3 = inputs.nextLine();
        Student StudentEmail3 = new Student();
        System.out.println("You entered: " + email3);
        StudentEmail3.setEmail(email3);

        System.out.println("Please enter your course: ");
        String course3 = inputs.nextLine();
        Student StudentCourse3 = new Student();
        System.out.println("You entered: " + course3);
        StudentCourse3.setCourse(course3);

        //all information
        //Student info = new Student(name , email , course);
        System.out.println("Student name:  " + name);
        System.out.println("Student email:  " + email);
        System.out.println("Student course:  " + course);
        System.out.println("Student 2 name:  " + name2);
        System.out.println("Student 2 email:  " + email2);
        System.out.println("Student 2 course:  " + course2);
        System.out.println("Student 3 name:  " + name3);
        System.out.println("Student 3 email:  " + email3);
        System.out.println("Student 3 course:  " + course3);

        //System.out.println("student 3 email:  " + Student2);
        //System.out.println("student 3 course:  " + Student3);


    }
}
