package ie.atu.StudentApp;

public class Student
{
    private String name;
    private String email;
    private String course;

    public Student(){
           this.name = "";
           this.email = "";
           this.course = "";
    }

    public Student(String name, String email, String course) {
        this.name = name;
        this.email = email;
        this.course = course;

    }

    public String SetName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String SetEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String SetCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}



