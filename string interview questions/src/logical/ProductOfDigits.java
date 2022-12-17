package logical;

public class ProductOfDigits
{
	
public static void main(String[] args) {
	int n=315;
	int prod=1;
	while (n>0) {
		prod=prod*(n%10);
		n=n/10;
	}
	System.out.println(prod);
	}

}
