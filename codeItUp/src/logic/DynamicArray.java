package logic;

import java.util.Scanner;

public class DynamicArray {
	public static void main(String[] args) {
		int size;
		Scanner sc = new Scanner(System.in);
		
		size=sc.nextInt();
	
		int []arr= {size};
		
		
	
		
		for (int i1 = 0; i1 < size; i1++) {
			System.out.println("enter element");
			arr[i1]=sc.nextInt();
			i1++;
		}
	

	}

}
