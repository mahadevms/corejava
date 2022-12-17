package fileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferWriter {
public static void main(String[] args) {
try {
	FileWriter fw = new FileWriter("G:\\test\\test1.txt",true);
BufferedWriter bw=	new BufferedWriter(fw);
bw.write("hello this is mike");
bw.newLine();
bw.write("hello ");
 bw.newLine();
 bw.write("this is mshadev");
 bw.newLine();
 bw.write("this is tyson");
 bw.newLine();
 bw.close();
} catch (Exception e) {
	e.printStackTrace();
}
}
}
