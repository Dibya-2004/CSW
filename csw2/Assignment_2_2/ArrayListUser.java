package Assignment_2_2;

import java.util.*;

public class ArrayListUser {
	public static void main(String[] args) {
		ArrayList<user> list = new ArrayList<>();

		list.add(new user("Amit", 20));
		list.add(new user("Dibya", 21));
		list.add(new user("Uman", 1));
		System.out.println(list);
		Collections.sort(list, new Agecomparetor());
		System.out.println(list);

	}
}

class user {
	private int age;
	private String name;

	public user(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "user [name=" + name + ", age=" + age + "]";
	}

}

class Agecomparetor implements Comparator<user> {
	@Override
	public int compare(user u1, user u2) {
		return Integer.compare(u1.getAge(), u2.getAge());
	}

}