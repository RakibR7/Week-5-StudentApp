package ie.atu.StudentApp;

public class Student
{
    private String name;
    private String email;
    private String course;

    public Student(){
        this.name = "  ";
        this.email = "  ";
        this.course = "  ";
    }

    public Student(String name2, String email2, String course2) {
        this.name = name2;
        this.email = email2;
        this.course = course2;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}

