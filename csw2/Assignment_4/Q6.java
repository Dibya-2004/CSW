package Assignment_4;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime r=Runtime.getRuntime();
		
		System.out.println(getTimestamp()+"- Starting Memory Test...");
		printMemoryUsage(r);
		
		for(int i=0;i<5000;i++) {
			byte[] data=new byte[1024*100];
		}
		System.out.println(getTimestamp()+"-Requesting garbage Collection...");
		System.gc();
		
		System.out.println(getTimestamp()+"- After GC:");
		printMemoryUsage(r);
		
		System.out.println(getTimestamp()+"- Memory Test Completed.");
	}
	private static String getTimestamp() {
		// TODO Auto-generated method stub
		return java.time.LocalTime.now().toString();
	}
	private static void printMemoryUsage(Runtime r) {
		System.out.println("Total heap memory "+r.totalMemory()/(1024*1024)+" MB");
		System.out.println("Free heap memory "+r.freeMemory()/(1024*1024)+" MB");
		System.out.println("-0-----0------0------0------0------0------0-----0-");
		
	}
}
