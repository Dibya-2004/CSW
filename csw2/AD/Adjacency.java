package AD;
import java.util.*;
class Node{
	char vertex;
	Node next;
}  
public class Adjacency {
		public static Node create(){
	     Scanner sc = new Scanner(System.in);
	     System.out.print("Enter 1st vertex ");
	     char k = sc.next().charAt(0);
	     Node p = new Node();
	     p.vertex = k;
	    Node start = p;
	     System.out.println("Do you want to add more vertex (y|n): ");
	 char l = sc.next().charAt(0);
	     while(l!='n'){
	         System.out.print("Enter vertex ");
	          k = sc.next().charAt(0);
	         Node q = new Node();
	         q.vertex = k;
	         p.next = q;
	         p = q;
	         System.out.println("Do you want to add more vertex (y|n): ");
	          l = sc.next().charAt(0);
	     }
	     return start;
	 }
	    
	    static void display(Node x) {
	    	System.out.print(x.vertex);
	    	x=x.next;
	    	while (x!=null) {
	    		System.out.print("-->"+x.vertex);
	    		x=x.next;
	    	}
	    	System.out.println();
	    }
	    
	    //utr j76uty
	public static void edge(int[][] m, int h,int t) {
		m[h][t]=1;
		m[t][h]=1;
	}
	public static void display(int[][] m) {
		System.out.println("Matrix:");
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[0].length;j++) {
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v=5;
		int[][] m=new int[v][v];
		edge(m,0,1);
		edge(m,1,4);
		edge(m,2,4);
		edge(m,3,2);
		edge(m,0,3);
		edge(m,2,1);
		display(m);
		

			Node A=create();
			Node B=create();
			Node C=create();
			Node D=create();
			Node E=create();
		
			display(A);
			display(B);
			display(C);
			display(D);
			display(E);
	}
	
}
