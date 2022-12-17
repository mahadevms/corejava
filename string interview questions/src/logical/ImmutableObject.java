package logical;

public class ImmutableObject  {
public static void main(String[] args) {
	ImmutableClass ic=new ImmutableClass("mahadev",1008);
	int i = ic.getI();
	String s = ic.getS();
	
	System.out.println(i);
	System.out.println(s);
}
}
