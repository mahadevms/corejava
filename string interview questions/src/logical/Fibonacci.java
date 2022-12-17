package logical;

public class Fibonacci {
public static void main(String[] args) {
	int f=1,s=1,t;
	System.out.println(f);
	System.out.println(s);
	x:for (int i =1; i <50; i++) {
		t=f+s;
		if (t>100) {
			break x;
		}
		System.out.println(t);
		f=s;
		s=t;
		
		
	}
}
}
