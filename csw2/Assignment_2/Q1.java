package Assignment_2;
class Student<T>{
	private String name;
	private T rollNo;
	private int age;
	public Student(String name, T rollNo, int age) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.age = age;
	}
	void display() {
		System.out.println("student details:" );
		System.out.println("name "+name+"rollNo"+rollNo+"age"+age);
	}
}

public class Q1 {

	public static void main(String[] args) {
		Student<Integer> s1=new Student<>("amit",100,10);
		Student<String> s2=new Student<>("amit","ab1",10);
		s1.display();
		s2.display();
	}

}
