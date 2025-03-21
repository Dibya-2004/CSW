package inheritance;
class Shape{
	
}
class Circle extends Shape{
	int r=10;
	double area(int r) {
		double a=(3.14)*r*r;
		return a;
	}
	double perimeter(int r) {
		double p=2*(3.14)*r;
		return p;
	}
}
class Rectangle extends Shape{
	double area(int l,int b) {
		double a=l*b;
		return a;
	}
	double perimeter(int l,int b) {
		double p=2*(l+b);
		return p;
	}
}
class Triangle extends Shape{
	double area(int h,int b) {
		double a=(0.5)*b*h;
		return a;
	}
	double perimeter(int l1,int l2,int l3) {
		double p=l1+l2+l3;
		return p;
	}
}
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c=new Circle();
		Rectangle r=new Rectangle();
		Triangle t=new Triangle();
		System.out.println(c.area(7));
		System.out.println(c.perimeter(7));
		System.out.println(r.area(7,5));
		System.out.println(r.perimeter(7,5));
		System.out.println(t.area(10,6));
		System.out.println(t.perimeter(4,5,3));
	}

}
