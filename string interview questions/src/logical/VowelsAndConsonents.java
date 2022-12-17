package logical;

import java.util.Scanner;

public class VowelsAndConsonents {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String c=sc.next();
	if (c.length()==1) {
		if (c.matches("[aeiou]")) {
			System.out.println("vowels");
		} else if(c.matches("[a-z]")) {
			System.out.println("consonents");
		}else if(c.matches("[0-9]")){
			System.out.println("NUMBERS");
		}else {
			System.out.println("chars");
		}
		
	} else {
System.out.println("invalid char");
	}
}
}
