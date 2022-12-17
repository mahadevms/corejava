package conditional;

public class C {
public static void main(String[] args) {
	int arr[]= {1,2,2,3,4,4,5,6,7,7};
	//int len=arr.length;//7 len-1=6
	// int temp[]=new int[arr.length];//7
	 int j=0;//012345
	 for (int i = 0; i < arr.length-1; i++) {//0 1 2 3 4 5 6
		 if (arr[i] !=arr[i+1]) {
			arr[j++]= arr[i];     //1 2 3 4
		//	j++;//0 1 2 3 4 
			}
	}
	 arr[j++]=arr[arr.length-1];
	
	 
	 
	 for (int k = 0; k < j; k++) {//0 1 2 3 4
		System.out.println(arr[k]);//1 2 3 4 5
	}
}
}
