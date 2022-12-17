package practice_folder;

public class C {
public static void main(String[] args) {
	
	int n=6;
	for (int i = 1; i <= n; i++) {
		
		for (int j = n; j > i; j--) {
			System.out.print(" ");
		}
		int x=i;
		for (int k = 1; k<x+i; k++) {
			System.out.print("*");
		}
	
		System.out.println();
	}
}
}
