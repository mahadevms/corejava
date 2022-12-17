package array;
//without removing duplicate elements
public class MaxAndMinSalery {
public static void main(String[] args) {
	int[]arr= {70,2,3,5,6,664,664,664,6,6,64,4,3,3,5,7};
	MaxAndMinSalery.sort(arr);
}

public static void sort(int[] sort) {
for (int i = 0; i < sort.length-1; i++) {
	for (int j = 0; j < sort.length-1; j++) {
		if (sort[j]>sort[j+1]) {
			int temp=sort[j];
			sort[j]=sort[j+1];
			sort[j+1]=temp;
		}
	}
}
System.out.println("sorted array:");
for (int i = 0; i < sort.length; i++) {
	System.out.print(sort[i]+" ");
}
System.out.println();



x:if (sort.length>1) {
	for (int i = sort.length-1; i >0; i--) { 
		if (sort[i]>sort[i-1]) {
			System.out.println("max 2 salery= "+sort[i-1]+" and "+sort[i]);
			break x;
			}
	
} 

	}else {
		System.out.println("enter atleast 2 number!");
	}
	





}



}

















