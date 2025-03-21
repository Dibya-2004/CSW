package Assignment1;
import java.util.ArrayList;
import java.util.List;

class Course {
    private int courseId;
    private String courseName;
    private List<Student> enrolledStudents;

    public Course(int courseId,String courseName){
        this.courseId=courseId;
        this.courseName=courseName;
        this.enrolledStudents=new ArrayList<>();
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(List<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

}

class Enrollment {

}

public class A10 {

}

interface EnrollmentSystem {
void enrolStudent(Student student,Course course);
void dropStudent(Student student,Course course);
void displayEnrollments();
}

class Student {
    private int StudentId;
    private String studentName;
    
    public Student(int studentId,String studentName){
        this.StudentId=StudentId;
        this.studentName=studentName;
    }

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    
}
