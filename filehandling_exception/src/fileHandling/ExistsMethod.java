package fileHandling;
//exists method
import java.io.File;

public class ExistsMethod {
public static void main(String[] args) {
	File f=new File("G:\\test\\xl.xlsx");
	File g=new File("G:\\test\\hi.docx");
	File h=new File("G:\\test\\img.bmp");
	File i=new File("G:\\test\\simp.url");
	File j=new File("G:\\test\\test1.txt");
	
boolean b = f.exists();//non static method present in file class,this method will check whether the file in given path exists or not
boolean c = g.exists();//return type of this method is a boolean value
boolean d = h.exists();
boolean e = i.exists();
boolean v = j.exists();
System.out.println(b);//if the file exists in a given path it returns true or else false
System.out.println(c);
System.out.println(d);
System.out.println(e);
System.out.println(v);
}
}
