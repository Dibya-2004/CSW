package interFace;
interface Constants{
	double pi=22.0/7;
	long SPEED_OF_LIGHT=(long) (3*Math.pow(10, 8));
}
class PhysicsConstants implements Constants{
	void display() {
		System.out.println("PI IS : "+pi);
		System.out.println("SPEED OF LIGHT IS : "+SPEED_OF_LIGHT);
	}
}
public class Q3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhysicsConstants pc=new PhysicsConstants();
		pc.display();
	}
}
