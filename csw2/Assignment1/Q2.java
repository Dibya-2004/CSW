package Assignment1;
class Rectangle{
	private int l;
	private int w;
	Rectangle(int l,int w){
		this.l=l;
		this.w=w;
	}
	public int getL() {
		return l;
	}
	public void setL(int l) {
		this.l = l;
	}
	public int getW() {
		return w;
	}
	public void setW(int w) {
		this.w = w;
	}                  
	int calculateArea() {
		return l*w;
	}
	int calculatePerimeter() {
		return 2*(l+w);
	}
}
public class Q2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l=7,w=8;
		Rectangle r=new Rectangle(l,w);
		System.out.println(r.calculateArea());
		System.out.println(r.calculatePerimeter());
	}
}
