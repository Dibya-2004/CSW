package Assignment1;
class Point{
	int X,Y;
	Point(int X,int Y){
		this.X=X;
		this.Y=Y;
	}
	Point(Point p1) {
		this.X=p1.X;
		this.Y=p1.Y;
	}
}
public class A3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1=new Point(5,7);
		Point p2=new Point(p1);
		System.out.println(p1.X+" "+p1.Y);
		System.out.println(p2.X+" "+p2.Y);
		System.out.println(p1+" "+p2);
	}

}
