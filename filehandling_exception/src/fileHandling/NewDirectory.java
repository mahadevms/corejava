package fileHandling;

import java.io.File;

//mkdir=is used for creating folders
public class NewDirectory {
public static void main(String[] args) {
	File f =new File(" ");
	boolean b = f.mkdir();
	System.out.println(b);

}
}
