package Assignment_2;

import java.util.Iterator;
import java.util.Scanner;

class Studentt implements Comparable<Studentt> {
	String name;
	int rollNo;
	int totalMark;

	public Studentt(String name, int rollNo, int totalMark) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.totalMark = totalMark;
	}

	@Override
	public int compareTo(Studentt other) {
		return Integer.compare(this.rollNo, other.rollNo);
	}

}

public class Q4_Q5{

	public static void main(String[] args) {
		Studentt[] student = {
				new Studentt("amit", 01, 90),
				new Studentt("Dibya", 02, 91),
				new Studentt("uman", 03, 92),
				new Studentt("Dr", 04, 93),
		};
		Scanner sc = new Scanner(System.in);

		boubleSort(student);
		System.out.println("enter roll to search");
		int rollToFind = sc.nextInt();

		for (Studentt s : student) {
			if (s.rollNo == rollToFind) {
				System.out.println("student found " + s.name);
				return;
			}
		}
		System.out.println("student not found");
	}

	static void boubleSort(Studentt[] s) {
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s.length-1; j++) {
				if (s[j].rollNo > s[j + 1].rollNo) {
					Studentt temp = s[j];
					s[j] = s[j + 1];
					s[j + 1] = temp;
				}
			}

		}

	}

	void display(Studentt[] s) {
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i].name);
		}
	}

}
