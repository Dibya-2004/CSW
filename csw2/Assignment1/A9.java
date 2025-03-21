package Assignment1;
interface Vehicle {
    void accelerate();
    void brake();
}
class Car1 implements Vehicle {

    public void accelerate() {
        System.out.println("Car is accelerating...");
    }
    public void brake() {
        System.out.println("Car is braking...");
    }
    public void accelerate(int speed) {
        System.out.println("Car is accelerating at " + speed + " km/h");
    }
    public void accelerate(int speed, int duration) {
        System.out.println("Car is accelerating at " + speed + " km/h for " + duration + " seconds");
    }
}
class Bicycle implements Vehicle {
    public void accelerate() {
        System.out.println("Bicycle is accelerating...");
    }

    public void brake() {
        System.out.println("Bicycle is braking...");
    }
    public void accelerate(int speed) {
        System.out.println("Bicycle is accelerating at " + speed + " km/h");
    }
    public void accelerate(int speed, int duration) {
        System.out.println("Bicycle is accelerating at " + speed + " km/h for " + duration + " seconds");
    }
}
public class A9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car1 car = new Car1();
        Bicycle bicycle = new Bicycle();

        car.accelerate();
        car.brake();
        bicycle.accelerate();
        bicycle.brake();

        car.accelerate(60);
        car.accelerate(80, 10);
        bicycle.accelerate(20);
        bicycle.accelerate(25, 5);
	}

}
