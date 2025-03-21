package java1;
import java.util.Scanner;
class Complex1 {
	int real;
	int imag;
	
	void getData(int x, int y){
		real=x;
		imag=y;
	}
	
	void display(int x, int y) {
		System.out.println("Complex Number is: "+x+ " + " +y+"i");
	}
	void add(Complex c1, Complex c2) {
		real=c1.real+c2.real;
	}
}
public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		Complex complex1=new Complex();
		complex1.getData(x,y);
		complex1.display(x,y);
		Complex complex2=new Complex();
		complex1.getData(x,y);
		complex1.display(x,y);
	}

}
