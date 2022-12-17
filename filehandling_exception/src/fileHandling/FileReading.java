package fileHandling;
//by using read method
import java.io.File;
import java.io.FileReader;

public class FileReading {
public static void main(String[] args) {
try {
	File f =new File("G:\\test\\test1.txt");
	FileReader fr=new FileReader(f);
	for (int i = 0; i < f.length(); i++) {
		System.out.print((char)fr.read());
	}
	
	fr.close();
	
} catch (Exception e) {
	e.printStackTrace();
}

}
}
