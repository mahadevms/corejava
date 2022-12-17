package logical;

public class ReverseEachWord {
public static void main(String[] args) {
	String s="PANKAJ SIR ACADEMY";
	String[] s1 = s.split(" ");
	String reversedString="";
	for (String w : s1) {
		String reverseWord="";
		for (int i =w.length()-1; i>=0; i--) {
			reverseWord=reverseWord+w.charAt(i);
		}
		reversedString=reversedString+reverseWord+" ";
	}
	System.out.println(reversedString);
}
}
