package logical;

public class ReversePrinting {
public static void main(String[] args) {
	String s="hello this is mahadev";
	for (int i = s.length()-1; i >=0 ; i--) {
		System.out.print(s.charAt(i));
	}
}
}
