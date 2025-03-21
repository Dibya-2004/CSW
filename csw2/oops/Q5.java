package oops;
class Person1{
	String name;
	int age;
	Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Student1 extends Person1{
String major;
    
    Student1(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    void displayInfo() {
        System.out.println("Student: " + name + ", Age: " + age + ", Major: " + major);
    }
}
class Teacher1 extends Person1 {
    String subject;
    
    Teacher1(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayInfo() {
        System.out.println("Teacher: " + name + ", Age: " + age + ", Subject: " + subject);
    }
}
public class Q5 { 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Person1[] people = new Person1[2];
	        
	        people[0] = new Student1("Virat", 20, "Computer Science");
	        people[1] = new Teacher1("Dale", 45, "Mathematics");
	        
	        for (Person1 person : people) {
	            person.displayInfo();
	        }
	}

}
