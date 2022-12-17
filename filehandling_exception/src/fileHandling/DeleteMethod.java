package fileHandling;

import java.io.File;

public class DeleteMethod {
public static void main(String[] args) {
	File f=new File("G:\\del\\xl.xlsx");
	File g=new File("G:\\del\\hi.docx");
	File h=new File("G:\\del\\img.bmp");
	File i=new File("G:\\del\\simp.url");
	File j=new File("G:\\del\\test1.txt");
	
boolean b = f.delete();//non static method present in file class,this method will check whether the file in given path exists or not
boolean c = g.delete();//return type of this method is a boolean value
boolean d = h.delete();
boolean e = i.delete();
boolean v = j.delete();
System.out.println(b);//if the file exists in a given path it returns true or else false
System.out.println(c);
System.out.println(d);
System.out.println(e);
System.out.println(v);

}
}
