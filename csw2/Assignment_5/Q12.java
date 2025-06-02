package Assignment_5;

import java.io.File;

public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String path="C:\\Users\\STUDENT\\Desktop\\MyDiary";
	File dir= new File(path);
	
	if(dir.exists() && dir.isDirectory()) {
		String[] dlist=dir.list();
		
		System.out.println("File and directory in "+path+":");
		for(String f:dlist) {
			System.out.println(f);
		}
	}else {
		System.out.println("invalid");
	}
	}

}
