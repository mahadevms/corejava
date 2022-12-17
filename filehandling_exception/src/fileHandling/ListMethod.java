package fileHandling;

import java.io.File;

public class ListMethod {
public static void main(String[] args) {
	File f=new File("G://del//");
	String[] l = f.list();
for (String s : l) {
	System.out.println(s);
}
	
}
}
