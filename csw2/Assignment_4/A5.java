package Assignment_4;

import java.lang.ref.Cleaner;

class Jc {
	private static final Cleaner cleaner = Cleaner.create();
	private final Cleaner.Cleanable cleanable;
	
	private int a;
	private double b;
	
	public Jc(int a , double b) {
		this.a=a;
		this.b=b;
		
		this.cleanable=cleaner.register(this, () ->
		System.out.println("DataObject with values ("+a+","+b+") is being garbage collected."));
	}
	public void updateV(int a1,double b1) {
		this.a=a1;
		this.b=b1;
	}
}
public class A5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Runtime runtime = Runtime.getRuntime();
		    System.out.println("Initial Memory Details:");
		    System.out.println("Total Memory: " + runtime.totalMemory());
		    System.out.println("Free Memory: " + runtime.freeMemory());
		    MemoryTest obj1 = new MemoryTest(60, 75.5);
		    MemoryTest obj2 = new MemoryTest(40, 85.7);
		    obj1.modify(70, 80.9);
		    obj2.modify(20, 90.3);
		    obj1 = null;
		    obj2 = null;
		    System.gc();
		    try {
		        Thread.sleep(3000);
		    } catch (InterruptedException e) {
		        e.printStackTrace();
		    }
		    System.out.println("Memory Details After GC:");
		    System.out.println("Total Memory: " + runtime.totalMemory());
		    System.out.println("Free Memory: " + runtime.freeMemory());
		}
	}

