package logical;

public class CountWords2 {
public static void main(String[] args) {
	String str=" pankaj sir academy ";
	String[] x = str.trim().split(" ");//trim removes spaces of string at first as well as last
	System.out.println(x.length);
	for (String s : x) {
		System.out.println(s);
	} 
}
}
