package Assignment_4;
class NullifiedReference {
    String str;
    NullifiedReference(String str) {
        this.str = str;
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage Collected: " + this.str);
    }
}
    public class Q3{
    public static void main(String[] args) {
        NullifiedReference obj = new NullifiedReference("Nullified Object");
        obj = null;
        System.gc();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
