package array;

import java.util.Scanner;

public class CreatingArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[6];
	for (int i = 0; i < arr.length; i++) {
		System.out.print("enter number:");
		arr[i] = sc.nextInt();
		}
	System.out.print("["+" ");
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+" ");
		}
	System.out.println("]");
}
}