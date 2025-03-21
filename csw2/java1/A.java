package java1;
import java.util.Scanner;
class Person{
	String Name;
	int age;
	void getData(String Name, int age) {
		this.Name=Name;
		this.age=age;
	}
	void display() {
		System.out.println("My Name is "+Name+" and age is "+age); 
	}
	void chkVote() {
		try {
		if(age>=18) {
			System.out.println(Name+" you are Elligible to vote");
		}
		else
			System.out.println(Name+" you are Not Elligible to vote");
	}catch(Exception e)
		{
		
		}
	}
}
public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person();
		Scanner sc=new Scanner(System.in);
		String n=sc.nextLine();
		int a=sc.nextInt();
		p.getData(n,a );
		p.display();
		p.chkVote();
	}
}
