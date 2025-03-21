package oops;
class Person{
	String fname;
	String lname;
	int age;
	Person(int age){
		this.age=age;
	}
	
	String getFullName(String fname,String lname) {
		return fname+" "+lname;
	}
}
class Student extends Person{
	int roll;
	Student(int roll){
		super(27);
		this.roll=roll;
	}
}
class Teacher extends Person{
	int id;
	Teacher(int id){
		super(40);
		this.id=id;
	}
}
public class Q3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student(20);
		Teacher t=new Teacher(101);
		System.out.println("Student details: "+s.getFullName("Virat","Kohli")+" with age "+s.age+ " Roll: "+s.roll);
		System.out.println("Teacher details: "+t.getFullName("AB","Devilliers")+" with age "+t.age+ " Roll: "+t.id);
	}
}
