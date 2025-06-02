package Assignment_4;
class test{
	String t;
	public test(String str) {
		this.t=str;
	}
@Override
	protected void finalize() throws Throwable{
	 System.out.println("Garbage collected: " + t );
     super.finalize();
 }	
public void show() {
    System.out.println("object is: " + t);
    display();
}
public void display() {
    test obj = new test("new " + t);
    System.out.println("Displaying object: " + obj.t);
}
}
public class Q1 {
public static void main(String[] args) {
	test obj1 = new test("Object 1");
    obj1.show();
    obj1 = null;
    System.gc();
    try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}

