package Assignment_4;
class ReassigningReference {
    String str;
    ReassigningReference(String str) {
        this.str = str;
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage Collected: " + this.str);
    }
}
 public class Q2{
    public static void main(String[] args) {
        ReassigningReference obj1 = new ReassigningReference("Obj x");
        ReassigningReference obj2 = new ReassigningReference("Obj y");
        obj1 = obj2;  
        System.gc();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

