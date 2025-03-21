package java1;
import java.util.Scanner;
public class Complex {
	int real;
	int imag;
	
	void getData(int x, int y){
		real=x;
		imag=y;
	}
	
	void display(int x, int y) {
		System.out.println("Complex Number is: "+x+ " + " +y+"i");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			int x=sc.nextInt();
			int y=sc.nextInt();
			Complex complex=new Complex();
			complex.getData(x,y);
			complex.display(x,y);
	}
}


