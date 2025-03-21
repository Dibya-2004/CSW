package encapsulation;
import java.util.Scanner;
class Student{
	private String name;
	private int age;
	private String grade;
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getGrade() {
		return grade;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		if(age<0)
			System.out.println("Enter positive value");
		else
			this.age = age;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
}
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Student s=new Student();
		System.out.println("Enetr name,age and grade in sequence");
		s.setName(sc.nextLine());
		s.setAge(sc.nextInt());
		s.setGrade(sc.next());
		System.out.println("Name : "+s.getName()+" Age : "+s.getAge()+ " Grade : "+s.getGrade() );
	}
}
