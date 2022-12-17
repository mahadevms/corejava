package conditional;

public class D {
public static void main(String[] args) {
	int arr[]= {10,20,20,30,40,40};
	int temp[]=new int[arr.length];//7(a[i]=
	int j=0;//0           
	for (int i = 0; i < arr.length-1; i++) {//0 1 2345
		if (arr[i]!=arr[i+1]) {//true false true true false
			temp[j]=arr[i];//[10 20 30
			j++;//0++1++2++
		}
		
	}	//3
	temp[j]=arr[arr.length-1];//
	for (int k = 0; k <j ; k++) {//3++4++5++6++7++
		System.out.println(temp[k]);
		
	}
}
}
