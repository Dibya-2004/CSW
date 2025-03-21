package abstraction;
abstract class Shape{
	void calculateArea() {	
	}
}
class Circle extends Shape{
	void calculateArea(int r) {
		int area=(22/7)*r*r;
		System.out.println("area of circle is : "+area);
	}
}
class Rectangle extends Shape{
	void calculateArea(int l,int b) {
		int area=l*b;
		System.out.println("area of rectangle is : "+area);
	}
}
public class Q1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c=new Circle();
		c.calculateArea(7);
		Rectangle r=new Rectangle();
		r.calculateArea(4,5);
	}
}
