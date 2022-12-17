package conditional;

import java.util.Scanner;

//ladder else if
public class A {
	
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("enter number:" );
     int enter = scan.nextInt();
	if (enter==1) {
		System.out.println("got it");
	} else if(enter==2) {
		System.out.println("its two");
	}else if(enter==3) {
		System.out.println("its thrice");
	}else if (enter>10) {
		System.out.println("over estimate");
	}else {
		System.out.println("invalid");
	}
	scan.close();
}
}
