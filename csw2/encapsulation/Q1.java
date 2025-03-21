package encapsulation;
import java.util.Scanner;
class Circle{
	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
}
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Circle c = new Circle();
		double area;
		System.out.println("Enetr the radius");
		c.setRadius(sc.nextInt());
		int r=c.getRadius();
		if(r<0)
			System.out.println("Give positive value");
		else {
			area=(22/7)*r*r;
			System.out.println("Area of the circle with radius "+r+" is : "+area);
		}
	}
}
