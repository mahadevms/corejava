package frequency;

public class A {
public static void main(String[] args) {
	int[]arr= {5,5,4,3,4,5,5};
	int[]temp=new int[arr.length];
	int flag=-1;
	for (int i = 0; i < arr.length; i++) {
		int count=1;
		for (int j = i+1; j < arr.length; j++) {
			if (arr[i]==arr[j]) {
				count++;
				temp[j]=flag;
			}
		}
		if (temp[i]!=flag) {
			temp[i]=count;
			System.out.println(arr[i]+"->"+temp[i]);
		}
	}
//	for (int i = 0; i < temp.length; i++) {
//		if (temp[i]!=flag) {
//			System.out.println(arr[i]+"->"+temp[i]+"times");
//		}
//	}
}
}
