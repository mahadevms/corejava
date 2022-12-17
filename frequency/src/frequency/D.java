package frequency;

public class D {
private String string;
private int i;
private char c;
private double d;

public D(String string, int i, char c, double d) {
		this.string=string;
		this.i=i;
		this.c=c;
		this.d=d;
	}

public static void main(String[] args) {
	D d1=new D("hello",85,'t',89.5);
	System.out.println(d1.toString(d1));
}

private char[] toString(D d1) {
	// TODO Auto-generated method stub
	return null;
}
}
