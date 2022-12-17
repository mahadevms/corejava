package array;
public class RemovingDuplicateElementsOfUnsortedArray {
public static void main(String[] args) {
	 int[]arr= {20,10,5,5,20,30,10,45,30,25};
	int[]C=RemovingDuplicateElementsOfUnsortedArray.original(arr);
	int[]B=RemovingDuplicateElementsOfUnsortedArray.sorting(C);
	RemovingDuplicateElementsOfUnsortedArray.removeDuplicate(B);
}
public static int[] sorting(int[]sort) {
	System.out.println();
	System.out.println("AFTER SORTING"+" ");
for (int i = 0; i < sort.length-1; i++) {
	for (int j = 0; j < sort.length-1; j++) {
		if (sort[j]>sort[j+1]) {
			int temp=sort[j];
			sort[j]=sort[j+1];
			sort[j+1]=temp;
		}
	}
	
}
for (int i = 0; i < sort.length; i++) {
	System.out.print(sort[i]+" ");
}
System.out.println();
return sort;

}

private static int[] removeDuplicate(int[]dup) {
	System.out.println();
	System.out.println("AFTER REMOVING DUPLICATE ELEMENTS");
	int j=0;
	int temp[]=new int[dup.length];
	for (int i = 0; i < dup.length-1; i++) {
		if (dup[i]!=dup[i+1]) {
			temp[j]=dup[i];
			j++;
		}
	}
	temp[j]=dup[dup.length-1];
for (int i = 0; i < j+1; i++) {
	System.out.print(temp[i]+" ");
	
}
System.out.println();
return temp;
}

private static int[] original(int[]orig) {
	System.out.println("original array");
for (int i = 0; i < orig.length; i++) {
	System.out.print(orig[i]+" ");
}
System.out.println();
return orig;
}
}