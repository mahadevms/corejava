package fileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader {
public static void main(String[] args) {
	try {
		FileReader fr = new FileReader("G:\\test\\test1.txt");
		BufferedReader br = new BufferedReader(fr);
		for (int i = 0; i <3; i++) {
			System.out.println( br.readLine());
			
			
		}
		br.close();
		
	} catch (IOException e) {
		e.printStackTrace();
	}
}}

