package interFace;
interface Movable{
	void move();
}
interface Resizable {
	void resize();
}
class Shape implements Resizable,Movable{
	public void move() {
		System.out.println("Moved"); 
	}
	public void resize() {
		System.out.println("Resized");
	}
}
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s=new Shape();
		s.move();
		s.resize();
		
	}

}
