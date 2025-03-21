package interFace;
interface MathOperations{
	static void add(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	static void substract(int a,int b){
		int c=a-b;
		System.out.println(c);
	}
}
class Calculator implements MathOperations{
	
}
public class Q2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathOperations.add(10,5);;
		MathOperations.substract(10,5);
	}
}