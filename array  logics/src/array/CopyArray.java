package array;


public class CopyArray {
public static void main(String[] args) {
	int []arr={10,20,30,40,50};
	int[]copy=new int[arr.length];
	for (int i = 0; i < copy.length; i++) {
		copy[i]=arr[i];
	}
	for (int i : copy) {
		System.out.println(i);
	}
	for (int i : arr) {
		System.out.println(i);
	}
}
}
