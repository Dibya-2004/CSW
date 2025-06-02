package Assignment_4;

import java.lang.ref.Cleaner;
import java.util.ArrayList;
import java.util.List;

class student{
	private static final Cleaner c=Cleaner.create();
	private final Cleaner.Cleanable cleanable;
	private String name;
	private int age;
	private String course;
	public student(String name, int age, String course) {
		this.name = name;
		this.age = age;
		this.course = course;
		
		this.cleanable=c.register(this, ()->
		System.out.println());
	}
	public void displayStudentInfo() {
		System.out.println("Studnet name: "+name+",Age: "+age+" ,course: "+course);
	}
	
}
public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime r=Runtime.getRuntime();
		System.out.println("Total heap memory "+r.totalMemory()/(1024*1024)+" MB");
		System.out.println("Free heap memory "+r.freeMemory()/(1024*1024)+" MB");
		
		List<student> student = new ArrayList<>();
		student.add(new student ("SP",31,"Computer Science"));
		student.add(new student ("PD",22,"IT "));
		student.add(new student ("YSG",30,"civil Eng"));
		
		System.out.println("\nEnrolled students:");
		for(student stu:student) {
			stu.displayStudentInfo();
		}
		System.out.println("\nFree Heap Memory After Enrollment: "+r.freeMemory()/(1024*1024)+" MB");
		
		student.clear();
		System.gc();
		
		System.out.println("\nFree Heap Memory After Garbage Collection: "+r.freeMemory()/(1024*1024)+" MB");
	}

}
