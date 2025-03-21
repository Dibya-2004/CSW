package Assignment_2;
import java.util.Arrays;
import java.util.Comparator;
class Student3 {
	String name;
	int rollNo;
	int age;
    public Student3(String name, int rollNo, int age) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Name: " + name + ", Roll No: " + rollNo + ", Age: " + age;
    }
}
class SortByRollNo implements Comparator<Student3> {
    @Override
    public int compare(Student3 s1, Student3 s2) {
        return Integer.compare(s1.rollNo, s2.rollNo);
    }
}
class SortByAge implements Comparator<Student3> {
    @Override
    public int compare(Student3 s1, Student3 s2) {
        return Integer.compare(s1.age, s2.age);
    }
}
public class Q7 {
    public static void main(String[] args) {
        Student3[] students = {
            new Student3("A", 102, 20),
            new Student3("B", 101, 22),
            new Student3("C", 104, 21),
            new Student3("D", 103, 23)
        };
        System.out.println("Students before sorting:");
        for (Student3 student : students) {
            System.out.println(student);
        }
        Arrays.sort(students, new SortByRollNo());
        System.out.println("\nStudents sorted by Roll No:");
        for (Student3 student : students) {
            System.out.println(student);
        }
        Arrays.sort(students, new SortByAge());
        System.out.println("\nStudents sorted by Age:");
        for (Student3 student : students) {
            System.out.println(student);
        }
    }
}
