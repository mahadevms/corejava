package fileHandling;
//by using write method
import java.io.FileWriter;
import java.io.IOException;

public class FileWritermethods {
public static void main(String[] args) {
	try {
		FileWriter fw=new FileWriter("G:\\test\\test1.txt");
		fw.write("hello hello hello this is mahadev");
		
		fw.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
