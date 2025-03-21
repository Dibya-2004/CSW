package Assignment1;

class Car {
	String model;
	String make;
	Car(String model, String make) {
		this.model = model;
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public String getMake() {
		return make;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setMake(String make) {
		this.make = make;
	}
	void display() {
		System.out.println("Made by : " + make + " Model : " + model);
	}
}
public class CarTester {
	public static void main(String[] args) {
		Car myCar1 = new Car("Mercedes", "S-Class");
		Car myCar2 = null;
		System.out.println("Initial Details: ");
		myCar1.display();
		if (myCar2 == null) {
			System.out.println("myCar2 is null");
			myCar2 = new Car("", "");
		}
		myCar2.setMake("Buggati");
		myCar2.setModel("Chironss");
		System.out.println("\nUpdated Car Details:");
		myCar1.display();
		myCar2.display();
	}
}
