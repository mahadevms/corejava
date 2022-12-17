package array;

public class PrintingOfDuplicateElements {

	public static void main(String[] args) {
int [] arr= {10,20,20,30,30,40,50,50,60,70,80,80};
int []temp=new int [arr.length];
int j=0;
for (int i = 0; i < temp.length-1; i++) {
	if (arr[i]==arr[i+1]) {
		temp[j]=arr[i];
		j++;
	}
	temp[j]=arr[arr.length-1];
}
for (int i = 0; i <j; i++) {
	System.out.println(temp[i]);
}

	}

}
