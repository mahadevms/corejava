package fileHandling;
//compile time exception are handled mandatorily
import java.io.File;
import java.io.IOException;

public class CreateFileMethod {
public static void main(String[] args) {
	File f =new File("G:\\del\\test1.txt");//give the path to create file
	File g =new File("G:\\del\\test1.xlsx");
	File h =new File("G:\\del\\test1.docx");
	File j =new File("G:\\del\\test1.url");
	File k =new File("G:\\del\\test1.bmp");
	try {
		boolean k1 = k.createNewFile();//create the path by the non static method
		boolean b = f.createNewFile();
		boolean g1 = g.createNewFile();
		boolean h1 = h.createNewFile();
		boolean j1 = j.createNewFile();
		
		System.out.println(k1);//confirm whether file is created or not by using boolean value
		System.out.println(j1);
		System.out.println(b);
		System.out.println(g1);
		System.out.println(h1);
	} catch (IOException e) {
		e.printStackTrace();
		
	}
	
}
}
