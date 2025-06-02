package Assignment_5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Q10{
public static void main(String[] args) {
	 //TODO Auto-generated method stub
	try {
		BufferedReader r=new BufferedReader(new FileReader("diary.txt"));
		String line;
		while((line=r.readLine())!=null) {
			System.out.print(line);
		}
		r.close();
	}catch(IOException e) {
		e.printStackTrace();
	}
	
	
//	try(Scanner sc=new Scanner(file)){
//		while(sc.hasNextLine()) {
//			System.out.println(sc.nextLine());
//		}
//	}catch(FileNotFoundException e) {
//		System.out.println("error");
//		e.getMessage();
//	}
}
}