package array;

import java.util.Scanner;

public class MaxNumber {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("enter number a:");
  	int a = sc.nextInt(); 
  	System.out.print("enter number b:");
int b = sc.nextInt();
System.out.print("enter number c:");
int c = sc.nextInt();
if (c<a&&b<a) {
	System.out.println("max number= a ");
}  else if (a<b&&c<b) {
	System.out.println("max number= b");
	
}else {
	System.out.println("max number= c");
}




	}

}
