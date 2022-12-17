package array;

public class HowManyTimesRepeated {
public static void main(String[] args) {
	int [] arr={10,20,20,30,40,50,50,60,60,60,70};
	int num=10;
	int sum=0;
	for (int i = 0; i < arr.length; i++) {
		if (num==arr[i]) {
			sum=sum+1;
		}
		
	}
	System.out.println("key number repeated "+sum +" times");
}
}
