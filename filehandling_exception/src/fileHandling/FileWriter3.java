package fileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter3 {
public static void main(String[] args) {
	try {
		FileWriter fr = new FileWriter("G:\\test\\test1.txt");
		fr.write("98995");
		fr.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
