package conditional;

import java.util.Scanner;

public class B {
	public static void main(String[] args) {
		Scanner hi =new Scanner(System.in);
		System.out.print("enter key nummber: ");
		String key = hi.next();
		switch (key) {
		case  "1":
			System.out.println("one");
			break;
		case "2":
			System.out.println("two");
			break;
		case "3":
			System.out.println("three");
			break;
		case "4":
			System.out.println("four");
			break;  
	
		default:
			System.out.println("invalid");
			break;
		}
	}
	
	
	
}
