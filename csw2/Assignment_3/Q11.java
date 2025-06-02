package Assignment_3;
import java.io.File;
import java.io.FileNotFoundException;

class FileReadPermissionException extends Exception{
	public FileReadPermissionException(String msg) {
		super(msg);
	}
}
public class Q11 {
public static void main(String[] args){
	if(args.length==0) {
		System.out.println("using java Q10");
		return;
	}
	String filePath=args[0];
	File file ="C:\\Users\\STUDENT\\Desktop\\Chapter 6 (1).docx";
	try {
		if(!file.exists()) {
			throw new FileNotFoundException("Error file "+filePath);
		}
		if(!file.canRead()) {
			throw new FileReadPermissionException("Error file "+filePath);
		}
		System.out.println("File "+filePath+" is accessible.");
	} catch (FileNotFoundException | FileReadPermissionException e) {
		// TODO: handle exception
		System.out.println(e.getMessage());
	}
	
	
}
}
