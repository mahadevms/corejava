package array;

public class FindRepeatedNumbers {
public static void main(String[] args) {
	int arr[]= {1,2,2,3,4,2,1,4,3,4,4,4};
int	size=arr.length;
	int key=2;
	int temp[]=new int[size];
	int j=0;
	for (int i = 0; i < arr.length; i++) {//012
		if (arr[i]==key) {
			temp[j]=arr[i];//012
			j++;//0++1++2++
		}
	}
	for (int i = 0; i <j; i++) {
		
		System.out.println(temp[i]);
	}
	
}
}