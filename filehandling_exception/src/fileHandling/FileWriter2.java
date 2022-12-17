package fileHandling;
//by using array
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter2 {
public static void main(String[] args) {
	try {
		FileWriter fr = new FileWriter("G:\\test\\test1.txt");
		char[]ch= {'a','b','c','d','e','f','g'};
		fr.write(ch);
		fr.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
