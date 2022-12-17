package fileHandling;
//by using char array
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReading2 {
public static void main(String[] args) {
	File f=new File("G:\\test\\test1.txt");
	try {
		FileReader fr=new FileReader(f);
		char[]x=new char[(int) f.length()];
		fr.read(x);
		for (char c : x) {
			System.out.print(c);
		}
		fr.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
