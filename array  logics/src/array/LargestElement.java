package array;

public class LargestElement {

	public static void main(String[] args) {
int[]arr= {50000,30,70,1,34,1000,40,50,20,4000,0,-9,4};
int max=arr[0];
for (int i = 0; i < arr.length; i++) {
	if (arr[i]>max) {
		max=arr[i];
	}
}System.out.println(max);
int min=arr[0];
for (int i = 0; i < arr.length; i++) {
	if (arr[i]<min) {
		min=arr[i];
	}
}
		System.out.println(min);
		
	}

}
