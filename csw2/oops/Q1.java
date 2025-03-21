package oops;
class StringManipulator{
	void concatenate(String s1,String s2) {
		System.out.println(s1.concat(s2));
	}
	void concatenate(int s1,String s2) {
		
		System.out.println(s1+s2);
	}
	void concatenate(String s1,int s2) {
		
		System.out.println(s1+s2);
	}
}
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringManipulator sm=new StringManipulator();
		sm.concatenate("fsdcuyer","uedfiuye");
		sm.concatenate("fsdcuyer",69);
		sm.concatenate(420,"uedfiuye");
	}

}
