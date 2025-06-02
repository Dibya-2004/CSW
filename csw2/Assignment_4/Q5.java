package Assignment_4;
class MemoryTest {
    private int intVal;
    private double doubleVal;
    MemoryTest(int intVal, double doubleVal) {
		// TODO Auto-generated constructor 
        this.intVal = intVal;
        this.doubleVal = doubleVal;
    }
    void modify(int newInt, double newDouble) {
        this.intVal = newInt;
        this.doubleVal = newDouble;
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage Collected: MemoryTest Object");
    }
}
public class Q5 {
	public static void main(String[] args) {
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
