package Assignment_2_2;
import java.util.LinkedList;

class Student {
    private String name;
    private int age;
    private double mark;

    public Student(String name, int age, double mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public String name() { return name; }
    public void name(String name) { this.name = name; }
    
    public int age() { return age; }
    public void age(int age) { this.age = age; }
    
    public double mark() { return mark; }
    public void mark(double mark) { this.mark = mark; }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student)) return false;
        Student other = (Student) obj;
        return name != null && name.equals(other.name) && age == other.age && Double.compare(mark, other.mark) == 0;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", mark=" + mark + "]";
    }
}

public class Q4 {
    public static void main(String[] args) {
        LinkedList<Student> l = new LinkedList<>();
        l.add(new Student("A", 102, 20));
        l.add(new Student("B", 101, 2));
        l.add(new Student("C", 104, 22));
        l.add(new Student("D", 103, 24));
        Student s = new Student("B", 101, 2);
        
        if (l.contains(s)) {
            System.out.println("Found");
            l.remove(s);
        } else {
            System.out.println("Not found");
        }
        System.out.println(l);
        System.out.println();
    }
}