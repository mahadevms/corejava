package logic;

public class SortingfArrays {

	public static void main(String[] args) {
int arr[]= {10,5,20,40,50,78,98};
int t;
for (int i = 0; i < arr.length-1; i++) {//0 0<5 0++

for (int j = 0; j < arr.length-1; j++) {//0 0<5 0++
	if (arr[j]>arr[j+1]) {
		 t=arr[j];
		arr[j]=arr[j+1];
		arr[j+1]=t;
		
	}
	
}

}

	for (int k = 0; k < arr.length; k++) {
		System.out.print(arr[k]+" ");
	}	
		
		
		
		
		
		
		
	}

}
