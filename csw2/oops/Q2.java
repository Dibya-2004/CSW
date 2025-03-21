package oops;
import java.util.Arrays;
class SortingHelper{
	void sort(int[] a) {
		Arrays.sort(a);
	}
	void sort(String[] a) {
		Arrays.sort(a);
	}
}
public class Q2 { 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortingHelper sh=new SortingHelper();
		int[] a= {3,6,1,9,10,-1,5,-90};
		sh.sort(a);
		String[] s= {"a","k","j","b","z","p"};
		sh.sort(s);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(s));	
	}
}
