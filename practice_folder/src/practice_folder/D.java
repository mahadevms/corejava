package practice_folder;

public class D {
public static void main(String[] args) {
	int n=5;
	for (int i = 1; i <= n; i++) {
		for (int j = 1; j < i; j++) {
			System.out.print(" ");
		}
	
		for (int k = n*2-i ; k>=i; k--) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
