package array;

import java.util.Scanner;

public class SumOfArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int size ;
	System.out.print("enter size of array;");
	size=sc.nextInt();
	int arr[]=new int[size];
	for (int i = 0; i < size; i++) {
		System.out.print("enter element:");
		arr[i]=sc.nextInt();
	}
	System.out.println("your Array:");
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	int sum=1;
	for (int i = 0; i < size; i++) {
		sum=sum*arr[i];
	}
	System.out.println("multiplication of the Array="+sum);
	
	
	
}
}
