package abstraction;

abstract class Person {
	String fname;
	String lname;
	int eid;

	String getFullName(String fname, String lname) {
		return (fname + " " + lname);
	}

	void display(String name, int eid) {
	}
}

public class Employee extends Person {
	String getFullName(String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
		return (fname + " " + lname);
	}

	void display(String name, int eid) {
		System.out.println("Name of Employee : " + name);
		System.out.println("Employee id : " + eid);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		String name = e.getFullName("ITS", "UGM");
		e.display(name, 101);
	}
}
