package Assignment_4;
class AnonymousObject{
	String str;
	public AnonymousObject(String s) {
		// TODO Auto-generated constructor st
		this.str = s;
	}
@Override
protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Garbage Collected: " + this.str);
	}
}
public class Q4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AnonymousObject("hello");
		System.gc();
		try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}
}
