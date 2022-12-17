package logical;

public class SumAndproductOfevenAndOdd {

	public static void main(String[] args) {
		int n=23453,sum=0,prod=1,digit=0;
		while (n>0) {
			digit=n%10;
			if (digit%2==0) {
				sum=sum+digit;
			} else {
				prod=prod*digit;
			}
			n=n/10;
		}
		System.out.println(sum);
		System.out.println(prod);
	}

}
