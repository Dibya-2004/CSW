package Assignment_2;
class Car implements Comparable<Car>{
	String model,color;
	double speed;
	public Car(String model, String color, double speed) {
		super();
		this.model = model;
		this.color = color;
		this.speed = speed;  
	}
	@Override
	public String toString() {
		return "Car [model=" + model + ", color=" + color + ", speed=" + speed + "]";
	}
	@Override
	public int compareTo(Car other) {
		return Double.compare(this.speed, other.speed);
	}
}
public class Q3 {
	public static void main(String[] args) {
		Car car1=new Car("BMW", "red", 150);
		Car car2=new Car("Tesla", "blue", 120);
		System.out.println("the faster car is "+car1.compareTo(car2));
	
		
	}

}
