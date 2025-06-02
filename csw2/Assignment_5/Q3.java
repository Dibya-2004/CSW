package Assignment_5;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	StringBuffer t= new StringBuffer();
	
	while(true){
		System.out.println("\n StringBuffer Operations");
		System.out.println("1. Append Text");
		System.out.println("2. Insert Text");
		System.out.println("3. Delete Text");
		System.out.println("4. Reverse Text");
		System.out.println("5. Replace Text");
		System.out.println("6. exit");
		System.out.println("Choose an option: ");
		int c=sc.nextInt();
		sc.nextLine();
		
		switch(c) {
		case 1:
			System.out.println("Enter text to append: ");
			String a=sc.nextLine();		
			t.append(a);
			break;
			
		case 2:
			System.out.println("Enter text to insert: ");
			String ins=sc.nextLine();
			System.out.println("Enter index to insert at: ");
			int ind=sc.nextInt();
			sc.nextInt();
			if(ind>=0&& ind <=t.length()) {
				t.insert(ind , ins);
			}else {
				System.out.println("Invalid index!");
			}
			break;
			
		case 3:
			System.out.println("Enter text index to delete: ");
			int s=sc.nextInt();	
			System.out.println("Enter end index to delete: ");
			int end=sc.nextInt();
			sc.nextLine();
			if(s >=0 && end <=t.length()&& s < end) {
				t.delete(s , end);
			}else {
				System.out.println("Invalid indices!");
			}
			break;
			
		case 4:
			t.reverse();
			break;
			
		case 5:
			System.out.println("Enter text index to replace: ");
			int rs=sc.nextInt();	
			System.out.println("Enter end index to replace: ");
			int re=sc.nextInt();
			System.out.println("Enter replacement text: ");
			String rt=sc.nextLine();
			sc.nextLine();
			if(rs >=0 && re <=t.length()&& rs < re) {
				t.replace(rs , re,rt);
			}else {
				System.out.println("Invalid indices!");
			}
			break;
		case 6:
			System.out.println("Exiting... .");
			sc.close();
			return;
			
		default:
			System.out.println("inavlid ");
			
		}
		System.out.println("\nCurrent text: "+t);
		System.out.println("Length: "+t.length()+" Capacity "+t.capacity());
		}
	}
}
