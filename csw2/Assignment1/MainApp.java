package Assignment1;

class College {
	String collegeName;
	String collegeLoc;

	public College(String collegeName, String collegeLoc) {
		this.collegeName = collegeName;
		this.collegeLoc = collegeLoc;
	}
}

class Student {
	int studentId;
	String studentName;
	College college;

	public Student(int studentId, String studentName, College college) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.college = college;
	}

	public void displayStudentInfo() {
		System.out.println("Student ID: " + studentId);
		System.out.println("Student Name: " + studentName);
		System.out.println("College Name: " + college.collegeName);
		System.out.println("College Location: " + college.collegeLoc);
		System.out.println("--------------------------------");
	}
}

public class MainApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		College college1 = new College("College 1", "Pakistan");
		College college2 = new College("College 2", "Uganada");

		Student student1 = new Student(101, "Annabella", college1);
		Student student2 = new Student(102, "Tatis bitchu", college2);

		student1.displayStudentInfo();
		student2.displayStudentInfo();
	}
}
