package array;

public class RemoveElementsOfSortedArray {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,5,6,6,7};
		int[] temp=new int[arr.length];
		int j=0;
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i]!=arr[i+1]) {
			temp[j++]=arr[i];
			}
			
		}
		temp[j++]=arr[arr.length-1]; 
		for (int i = 0; i <j; i++) {
			System.out.println(temp[i]);
		} 
		}
	}
