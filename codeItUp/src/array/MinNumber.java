package array;

import java.util.Scanner;

public class MinNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter number a:");
		int a=sc.nextInt();
		System.out.print("enter number b:" );
		int b = sc.nextInt();
		System.out.print("enter number c:" );
		int c = sc.nextInt();
		if (a>c&&b>c) {
			System.out.println("min number: "+c);
		}else if (c>a&&b>a) {
			System.out.println("min number: "+a);
		} 
		else {
			System.out.println("min number: "+b);
		}
		
		
		
		
		
		
		
		
	}

}
